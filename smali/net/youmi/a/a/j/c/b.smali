.class public Lnet/youmi/android/a/a/j/c/b;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/widget/Toast;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/j/c/b;->a:Landroid/content/Context;

    new-instance v0, Landroid/widget/Toast;

    iget-object v1, p0, Lnet/youmi/android/a/a/j/c/b;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/c/b;->b:Landroid/widget/Toast;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/c/b;->b:Landroid/widget/Toast;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/c/b;->b:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x11

    invoke-virtual {p0, p1, p2, v0, v1}, Lnet/youmi/android/a/a/j/c/b;->a(Ljava/lang/String;III)V

    return-void
.end method

.method public a(Ljava/lang/String;II)V
    .locals 1

    const/16 v0, 0x11

    invoke-virtual {p0, p1, p2, p3, v0}, Lnet/youmi/android/a/a/j/c/b;->a(Ljava/lang/String;III)V

    return-void
.end method

.method public a(Ljava/lang/String;III)V
    .locals 3

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    if-gtz p2, :cond_1

    :cond_1
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/c/b;->b:Landroid/widget/Toast;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p4, v1, v2}, Landroid/widget/Toast;->setGravity(III)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/c/b;->b:Landroid/widget/Toast;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setDuration(I)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/c/b;->b:Landroid/widget/Toast;

    iget-object v1, p0, Lnet/youmi/android/a/a/j/c/b;->a:Landroid/content/Context;

    invoke-static {v1, p1, p3}, Lnet/youmi/android/a/a/j/c/c;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/c/b;->b:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;I)V
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x30

    invoke-virtual {p0, p1, v0, p2, v1}, Lnet/youmi/android/a/a/j/c/b;->a(Ljava/lang/String;III)V

    return-void
.end method
