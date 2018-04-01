$(document).ready(function () {
  let timer;
  $('#search').keyup(function () {
    const that = this;
    clearTimeout(timer)
    timer = setTimeout(function () {
      const q = $(that).val();
      getQuery(q);
    }, 1000);
  })

  function getQuery(q) {
    $("#productList").empty();
    ProductService.getProducts(q, function (products) {
      console.log(products);
      shuffle(products);
      products.forEach(function (product) {
        let str = '<div class="Cell -3of12"><div>';
        str += '<img src=' + product.imgUrl + '>'
        str += '</div><div>';
        str += '<dl>';
        str += '<dt>' + product.name + '</dt>';
        str += '</dl>';
        str += '</div></div>';
        $('#productList').append(str);
      });
    })
  }

  function shuffle(a) {
    var j, x, i;
    for (i = a.length - 1; i > 0; i--) {
      j = Math.floor(Math.random() * (i + 1));
      x = a[i];
      a[i] = a[j];
      a[j] = x;
    }
  }
  getQuery('');
});