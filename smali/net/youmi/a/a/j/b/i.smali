.class Lnet/youmi/android/a/a/j/b/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/a/j/b/f;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/j/b/f;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/j/b/i;->a:Lnet/youmi/android/a/a/j/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/i;->a:Lnet/youmi/android/a/a/j/b/f;

    invoke-static {v0}, Lnet/youmi/android/a/a/j/b/f;->b(Lnet/youmi/android/a/a/j/b/f;)Lnet/youmi/android/a/a/j/b/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/i;->a:Lnet/youmi/android/a/a/j/b/f;

    iget-object v1, p0, Lnet/youmi/android/a/a/j/b/i;->a:Lnet/youmi/android/a/a/j/b/f;

    invoke-static {v1}, Lnet/youmi/android/a/a/j/b/f;->c(Lnet/youmi/android/a/a/j/b/f;)I

    move-result v1

    neg-int v1, v1

    invoke-static {v0, v1}, Lnet/youmi/android/a/a/j/b/f;->a(Lnet/youmi/android/a/a/j/b/f;I)V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/i;->a:Lnet/youmi/android/a/a/j/b/f;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/j/b/f;->d()V

    return-void
.end method
