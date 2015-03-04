.class Lnet/youmi/android/a/a/e/a/b/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/a/e/g/a;

.field final synthetic b:Lnet/youmi/android/a/a/e/g/f;

.field final synthetic c:Lnet/youmi/android/a/a/e/a/b/a;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/e/a/b/a;Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/a/e/g/f;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/a/b/e;->c:Lnet/youmi/android/a/a/e/a/b/a;

    iput-object p2, p0, Lnet/youmi/android/a/a/e/a/b/e;->a:Lnet/youmi/android/a/a/e/g/a;

    iput-object p3, p0, Lnet/youmi/android/a/a/e/a/b/e;->b:Lnet/youmi/android/a/a/e/g/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/e;->c:Lnet/youmi/android/a/a/e/a/b/a;

    iget-object v0, v0, Lnet/youmi/android/a/a/e/a/b/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/c/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/c/a;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/e/a/b/e;->a:Lnet/youmi/android/a/a/e/g/a;

    iget-object v2, p0, Lnet/youmi/android/a/a/e/a/b/e;->b:Lnet/youmi/android/a/a/e/g/f;

    invoke-virtual {v0, v1, v2}, Lnet/youmi/android/a/a/g/c/a;->a(Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/a/e/g/f;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
