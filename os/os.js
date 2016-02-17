var buttonGif = document.getElementById('button-gif');

buttonGif.addEventListener('mouseover', function() {
  document.image1.src = './button.14.on.gif';
});

buttonGif.addEventListener('mouseout', function() {
  document.image1.src = './button.14.gif';
});


var formWithReturn = document.getElementById('form-with-return');

formWithReturn.onsubmit = function() {
  return submitMe(this);
};

var formWithoutReturn = document.getElementById('form-without-return');

formWithoutReturn.onsubmit = function() {
  submitMe(this);
};

function submitMe(form) {
  if (parseInt(form.box.value) % 2 === 0) {
    return (true);
  } else {
    alert('Not an even numner');
    return (false);
  }
}
