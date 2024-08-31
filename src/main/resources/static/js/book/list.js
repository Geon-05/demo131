window.addEventListener('load',function(){
  go_insert_book();
  go_page;
})

let go_insert_book = function(){
  let btn_insert_book = document.querySelector('#btn_insert_book');

  btn_insert_book.addEventListener('click',function(){
    location.href='/book/bookInsert'
  })
}

let go_page = function(index){
  console.log(index);
}