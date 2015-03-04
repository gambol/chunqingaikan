.class Lnet/youmi/android/banner/f;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic a:Lnet/youmi/android/banner/e;


# direct methods
.method constructor <init>(Lnet/youmi/android/banner/e;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/banner/f;->a:Lnet/youmi/android/banner/e;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/banner/f;->a:Lnet/youmi/android/banner/e;

    iget v0, v0, Lnet/youmi/android/banner/e;->e:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lnet/youmi/android/banner/f;->a:Lnet/youmi/android/banner/e;

    invoke-virtual {v0}, Lnet/youmi/android/banner/e;->e()V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lnet/youmi/android/banner/f;->a:Lnet/youmi/android/banner/e;

    invoke-virtual {v0}, Lnet/youmi/android/banner/e;->f()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
