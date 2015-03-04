.class Lnet/youmi/android/a/b/k/b/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lnet/youmi/android/a/b/k/b/a;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/b/k/b/a;II)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/b/k/b/d;->c:Lnet/youmi/android/a/b/k/b/a;

    iput p2, p0, Lnet/youmi/android/a/b/k/b/d;->a:I

    iput p3, p0, Lnet/youmi/android/a/b/k/b/d;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lnet/youmi/android/a/b/k/b/d;->c:Lnet/youmi/android/a/b/k/b/a;

    invoke-static {v0}, Lnet/youmi/android/a/b/k/b/a;->a(Lnet/youmi/android/a/b/k/b/a;)Lnet/youmi/android/a/b/k/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/k/b/d;->c:Lnet/youmi/android/a/b/k/b/a;

    invoke-static {v0}, Lnet/youmi/android/a/b/k/b/a;->a(Lnet/youmi/android/a/b/k/b/a;)Lnet/youmi/android/a/b/k/a/a;

    move-result-object v0

    iget v1, p0, Lnet/youmi/android/a/b/k/b/d;->a:I

    iget v2, p0, Lnet/youmi/android/a/b/k/b/d;->b:I

    invoke-interface {v0, v1, v2}, Lnet/youmi/android/a/b/k/a/a;->a(II)V

    :cond_0
    return-void
.end method
