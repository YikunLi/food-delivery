package delivery.payment.domain;

/**
 * Created by liyikun on 2017/6/21.
 * The Channel of Payment:
 */
public class PaymentChannel {

    private Long id;

    private String name;

    private Channel channel;

    public static enum Channel {

        ALI_PAY,

        WECHAT_PAY,

        UNION_PAY,

        VISA,

        MASTER_CARD
    }

}
