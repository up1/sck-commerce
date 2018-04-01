"use strict";
var router = require('express').Router();

router.get('/', function(req, res, next) {
  res.render("product");
});

module.exports = router;
