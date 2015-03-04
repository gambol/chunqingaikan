.class Lnet/youmi/android/banner/g;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lnet/youmi/android/banner/e;


# direct methods
.method constructor <init>(Lnet/youmi/android/banner/e;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/banner/g;->a:Lnet/youmi/android/banner/e;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lnet/youmi/android/banner/g;->a:Lnet/youmi/android/banner/e;

    invoke-static {v0}, Lnet/youmi/android/banner/e;->a(Lnet/youmi/android/banner/e;)I

    move-result v0

    invoke-static {v0}, Lnet/youmi/android/banner/BannerManager;->getBannerObject(I)Lnet/youmi/android/banner/h;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/banner/h;->g()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Lnet/youmi/android/banner/g;->a:Lnet/youmi/android/banner/e;

    invoke-virtual {v1, v0}, Lnet/youmi/android/banner/e;->a(Lnet/youmi/android/banner/h;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lnet/youmi/android/banner/g;->a:Lnet/youmi/android/banner/e;

    invoke-static {v1, v0}, Lnet/youmi/android/banner/e;->a(Lnet/youmi/android/banner/e;Lnet/youmi/android/banner/h;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
