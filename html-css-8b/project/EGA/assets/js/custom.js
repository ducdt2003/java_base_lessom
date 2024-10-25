$(document).ready(function () {
    $(".owl-carousel").owlCarousel({
      loop: true, // vòng lặp
      margin: 10, // khaongr cách các item
      nav: false, // ẩn thanh điều hướng mở thanh điều hướng
      autoplay: true,
      autoplayTimeout: 2500,
      dots: false,
      responsive: {
        0: {
          items: 1, // tỷ lệ màn hình 0 đến 600 là 1 sản phầm
        },
        600: {
          items: 1,
        },
        1000: {
          items: 1,
        },
      },
    });
  });
  