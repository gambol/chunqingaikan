.class public Lnet/youmi/android/offers/c/a;
.super Lnet/youmi/android/a/a/e/a/a/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/a/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)Lnet/youmi/android/a/a/e/a/b/g;
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p1}, Lnet/youmi/android/offers/c/a;->a(I)Z

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    packed-switch p2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    new-instance v0, Lnet/youmi/android/offers/c/a/a;

    invoke-direct {v0}, Lnet/youmi/android/offers/c/a/a;-><init>()V

    goto :goto_0

    :pswitch_2
    new-instance v0, Lnet/youmi/android/offers/c/a/b;

    invoke-direct {v0}, Lnet/youmi/android/offers/c/a/b;-><init>()V

    goto :goto_0

    :pswitch_3
    new-instance v0, Lnet/youmi/android/offers/c/a/d;

    invoke-direct {v0}, Lnet/youmi/android/offers/c/a/d;-><init>()V

    goto :goto_0

    :pswitch_4
    new-instance v0, Lnet/youmi/android/offers/c/a/e;

    invoke-direct {v0}, Lnet/youmi/android/offers/c/a/e;-><init>()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public a(I)Z
    .locals 1

    const/16 v0, 0x66

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
