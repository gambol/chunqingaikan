.class Lnet/youmi/android/a/b/k/b/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/b/k/b/a;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/b/k/b/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/b/k/b/b;->a:Lnet/youmi/android/a/b/k/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/k/b/b;->a:Lnet/youmi/android/a/b/k/b/a;

    invoke-static {v0}, Lnet/youmi/android/a/b/k/b/a;->a(Lnet/youmi/android/a/b/k/b/a;)Lnet/youmi/android/a/b/k/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/k/b/b;->a:Lnet/youmi/android/a/b/k/b/a;

    invoke-static {v0}, Lnet/youmi/android/a/b/k/b/a;->a(Lnet/youmi/android/a/b/k/b/a;)Lnet/youmi/android/a/b/k/a/a;

    move-result-object v0

    invoke-interface {v0}, Lnet/youmi/android/a/b/k/a/a;->a()V

    :cond_0
    return-void
.end method
