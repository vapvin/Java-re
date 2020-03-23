public class OrderTest {
    public static void main(String[] args){
        Order order = new Order();
        order.orderNumber = 20182939;
        order.orderId = "abc123";
        order.orderDate = "2020년 3월 23일";
        order.orderName = "Names";
        order.productNum = "1892 -abc";
        order.address = "test test test test";

        System.out.println("주문번호:" + order.orderNumber);
        System.out.println("주문자 아이디:" + order.orderId);
        System.out.println("주문날짜:" + order.orderDate);
        System.out.println("주문자 이름:" + order.orderName);
        System.out.println("상품번호:" + order.productNum);
        System.out.println("배송주소:" + order.address);

    }
}
