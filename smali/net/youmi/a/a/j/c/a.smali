.class public Lnet/youmi/android/a/a/j/c/a;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/j/c/a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lnet/youmi/android/a/a/j/c/a;->a(Ljava/lang/String;II)V

    return-void
.end method

.method public a(Ljava/lang/String;II)V
    .locals 2

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    if-gtz p2, :cond_1

    const/4 p2, 0x3

    :cond_1
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/c/a;->a:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/a/j/c/a;->a:Landroid/content/Context;

    invoke-static {v1, p1, p3}, Lnet/youmi/android/a/a/j/c/c;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lnet/youmi/android/a/a/j/l;->a(Landroid/content/Context;Landroid/view/View;I)Lnet/youmi/android/a/a/j/l;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/j/l;->a()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
