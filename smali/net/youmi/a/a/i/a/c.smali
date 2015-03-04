.class Lnet/youmi/android/a/a/i/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lnet/youmi/android/a/a/i/a/b;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/i/a/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/c;->b:Lnet/youmi/android/a/a/i/a/b;

    iput-object p2, p0, Lnet/youmi/android/a/a/i/a/c;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/c;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-static {v0}, Lnet/youmi/android/a/a/i/a/b;->b(Lnet/youmi/android/a/a/i/a/b;)Lnet/youmi/android/a/a/i/a/f;

    move-result-object v0

    iget v0, v0, Lnet/youmi/android/a/a/i/a/f;->c:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/c;->b:Lnet/youmi/android/a/a/i/a/b;

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/i/a/b;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/c;->b:Lnet/youmi/android/a/a/i/a/b;

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/c;->a:Ljava/lang/String;

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/c;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-static {v2}, Lnet/youmi/android/a/a/i/a/b;->b(Lnet/youmi/android/a/a/i/a/b;)Lnet/youmi/android/a/a/i/a/f;

    move-result-object v2

    iget-object v2, v2, Lnet/youmi/android/a/a/i/a/f;->b:[B

    invoke-virtual {v0, v1, v2}, Lnet/youmi/android/a/a/i/a/b;->postUrl(Ljava/lang/String;[B)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/c;->b:Lnet/youmi/android/a/a/i/a/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/b;->reload()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
