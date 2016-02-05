
function givenNscores() {
  var numberOfScores = parseInt(prompt('Enter the # of scores:'));
  var scores = [];

  // Read the scores from the user
  for (var i = 0; i < numberOfScores; i++) {
    var score = parseInt(prompt('Enter the score:'));
    scores.push(score);
  }

  // Calculate min, max and sum
  var min = Number.MAX_VALUE;
  var max = Number.MIN_VALUE;
  var sum = 0;

  scores.forEach(function(score) {
    if (score < min) {
      min = score;
    }

    if (score > max) {
      max = score;
    }

    sum += score;
  });

  // Calculate the average
  var average = sum / scores.length;

  // Calculate how many scores are above the average
  var scoresAboveAverage = 0;
  scores.forEach(function(score) {
    if (score > average) {
      scoresAboveAverage += 1;
    }
  });

  // Show the output to the user
  alert([
    'Matheus\'s Output:',
    'Lowest = ' + min,
    'Highest = ' + max,
    'Average = ' + average,
    'Scores > Average = ' + scoresAboveAverage
  ].join('\n'))

}

function totalPayEmployee() {
  var name = prompt('Employee Name:');
  var ssn = prompt('Employee SSN:');
  var rate = parseInt(prompt('Rate of pay:', 10));
  var hoursWorked = parseInt(prompt('Hours Worked:', 50));

  var total = 0;

  if (hoursWorked > 40) {
    total = 40 * rate + ((hoursWorked - 40) * rate * 1.5);
  } else {
    total = hoursWorked * rate;
  }

  alert([
    'Employee: ' + name,
    'SSN: ' + ssn,
    'Hours Worked: ' + hoursWorked,
    'Rate of pay: ' + rate,
    'Total pay: $' + total
  ].join('\n'));
}

function saveInput() {
  var text = document.getElementById('input-save').value;
  localStorage.saved = text;
  document.getElementById('output-saved').innerHTML = text;
}

function validateForm(form) {
  return validateZip(form) && validateEmail(form);
}

function isDigit(num) {
  if (num.length > 1) {
    return false;
  }

  var string = "1234567890";

  if (string.indexOf(num) != -1) {
    return true;
  }

  return false;
}

// This function validates a zipcode to make sure that 5 digits are entered.
// If valid, it returns true. Else, it returns false.
function validateZip(form) {
  var zipStr = form.zip.value;

  if (zipStr.length !== 5 && zipStr.length !== 10) {
    error('Lenght must be 5 or 10');
    return false // abort submission
  }

  // length is good ... now check for all digits
  // go thru each of the chars in the zipcode string
  for (var i = 0; i < zipStr.length; i++) {
    var aChar = zipStr.charAt(i);

    if (i === 5 && aChar !== '-') {
      error('It should contains a "-": ddddd-dddd');
      return false;
    }

    if (i !== 5 && !isDigit(aChar)) {
      error('char is not a digit: ' + aChar);
      return false
    }
  }

  return true // proceed with submission
}

function validateEmail(form) {
  var email = form.email.value;

  var atPositions = [];
  var periodPositions = [];

  // get @ and . positions
  for (var i = 0; i < email.length; i++) {
    if (email.charAt(i) === '@') {
      atPositions.push(i);
    } else if (email.charAt(i) === '.') {
      periodPositions.push(i);
    }
  }

  // validate the @ positions
  if (atPositions.length !== 1) {
    error('Should contains one and only one "@" at the address.');
    return false;
  } else if (atPositions[0] === 0 || atPositions[0] === email.length - 1) {
    error('Shouldn\'t contains "@" at the beginning or at the end of the address.');
    return false;
  }

  // validate the . positions
  var dotAfterAt = false;

  for (var i = 0; i < periodPositions.length; i++) {
    var pos = periodPositions[i];

    if (pos === 0 || pos === email.length - 1) {
      error('Shouldn\'t contains "." at the beginning or at the end of the address.');
      return false;
    } else if (pos === atPositions[0] + 1) {
      error('Shouldn\'t contains "." immediately after "@".');
      return false;
    } else if (pos > atPositions[0] + 1) {
      dotAfterAt = true;
    }
  }

  if (!dotAfterAt) {
    error('Should contains one "." after the @ (but not immediately).');
    return false;
  }

  return true;
}

function error(message) {
  alert('Error: ' + message);
  // console.log('Error: ' + message);
}
