var fs = require('fs');
var expect = require('chai').expect;

// file is included here:
eval(fs.readFileSync(__dirname + '/assign1.js', 'utf-8'));

describe('Form Validation', function() {
  describe('#validateZip', function() {
    var form;

    before(function() {
      form = {
        zip: {
          value: ''
        }
      };
    });

    it('should return valid=true for correct zip codes', function() {
      var values = [
        '12345',
        '12345-6789'
      ];

      for (var i = 0; i < values.length; i++) {
        form.zip.value = values[i];

        expect(validateZip(form)).to.be.true;
      }
    });

    it('should return valid=false if length different then 5 or 10', function() {
      var values = [
        '1234',
        '123456',
        '123456789',
        '123456789012'
      ];

      for (var i = 0; i < values.length; i++) {
        form.zip.value = values[i];

        expect(validateZip(form)).to.be.false;
      }
    });

    it('should return valid=false for zip code without dash', function() {
      form.zip.value = '12345.6789';

      expect(validateZip(form)).to.be.false;
    });

    it('should return valid=false for non digit char', function() {
      var values = [
        '1234a',
        '12345-a789',
        '12345-678a',
        '12a45'
      ];

      for (var i = 0; i < values.length; i++) {
        form.zip.value = values[i];

        expect(validateZip(form)).to.be.false;
      }
    });

    it('should be invalid (professor data)', function() {
      var values = [
        '1234',
        '1234a',
        '12345b1234'
      ];

      for (var i = 0; i < values.length; i++) {
        form.zip.value = values[i];

        expect(validateZip(form)).to.be.false;
      }
    });

    it('should be valid (professor data)', function() {
      var values = [
        '12345',
        '12345-1234'
      ];

      for (var i = 0; i < values.length; i++) {
        form.zip.value = values[i];

        expect(validateZip(form)).to.be.true;
      }
    });
  });

  describe('#validateEmail', function() {
    var form;

    before(function() {
      form = {
        email: {
          value: ''
        }
      };
    });

    it('correct email should return valid', function() {
      form.email.value = 'msanto2@ilstu.edu';
      expect(validateEmail(form)).to.be.true;
    });

    it('shouldn\'t contains more than one @ sign', function() {
      form.email.value = 'msanto2@@ilstu.edu';
      expect(validateEmail(form)).to.be.false;
    });

    it('should contains at least one period after the @', function() {
      form.email.value = 'msanto2@ilstuedu',
        expect(validateEmail(form)).to.be.false;
    });

    it('shouldn\'t contains periods immediately after the @', function() {
      form.email.value = 'msanto2@.ilstu.edu';
      expect(validateEmail(form)).to.be.false;
    });

    it('shouldn\'t contains periods at the beginning of the address', function() {
      form.email.value = '.msanto2@ilstu.edu';
      expect(validateEmail(form)).to.be.false;
    });

    it('shouldn\'t contains periodos at the end of the address', function() {
      form.email.value = 'msanto2@ilstu.edu.';
      expect(validateEmail(form)).to.be.false;
    });

    it('shouldn\'t contains "@" at the beginning of the address', function() {
      form.email.value = '@msanto2ilstu.edu';
      expect(validateEmail(form)).to.be.false;
    });

    it('shouldn\'t contains "@" at the end of the address', function() {
      form.email.value = 'msanto2ilstu.edu@';
      expect(validateEmail(form)).to.be.false;
    });

    it('can contains periods after the first char and before the @', function() {
      form.email.value = 'msanto2.@ilstu.edu';
      expect(validateEmail(form)).to.be.true;
    });

    it('should be invalid (professor data)', function() {
      var values = [
        'email',
        '@email',
        'email@domain',
        'email@domain@com',
        'email@domain.',
        'email@.domain',
        '.email@domain.com',
        'email@domain.',
        'emaildomain@',
        'email@.domain.com'
      ];

      for (var i = 0; i < values.length; i++) {
        form.email.value = values[i];

        expect(validateEmail(form)).to.be.false;
      }
    });

    it('should be valid (professor data)', function() {
      var values = [
        'email.address@domain.x',
        'email@domain.com',
        'email@domain.com.cn',
        'email.@domain.com'
      ];

      for (var i = 0; i < values.length; i++) {
        form.email.value = values[i];

        expect(validateEmail(form)).to.be.true;
      }
    });
  });
});
