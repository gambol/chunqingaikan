.class Lnet/youmi/android/a/a/j/b/k;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/a/j/b/f;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/j/b/f;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/j/b/k;->a:Lnet/youmi/android/a/a/j/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/k;->a:Lnet/youmi/android/a/a/j/b/f;

    invoke-static {v0}, Lnet/youmi/android/a/a/j/b/f;->b(Lnet/youmi/android/a/a/j/b/f;)Lnet/youmi/android/a/a/j/b/d;

    move-result-object v0

    sget-object v1, Lnet/youmi/android/a/a/j/b/c;->a:Lnet/youmi/android/a/a/j/b/c;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/j/b/d;->setState(Lnet/youmi/android/a/a/j/b/c;)V

    return-void
.end method
