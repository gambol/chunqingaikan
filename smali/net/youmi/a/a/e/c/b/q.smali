.class Lnet/youmi/android/a/a/e/c/b/q;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lnet/youmi/android/a/a/e/g/h;

.field final synthetic c:Lnet/youmi/android/a/a/e/c/b/p;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/e/c/b/p;Landroid/content/Context;Lnet/youmi/android/a/a/e/g/h;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/c/b/q;->c:Lnet/youmi/android/a/a/e/c/b/p;

    iput-object p2, p0, Lnet/youmi/android/a/a/e/c/b/q;->a:Landroid/content/Context;

    iput-object p3, p0, Lnet/youmi/android/a/a/e/c/b/q;->b:Lnet/youmi/android/a/a/e/g/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/c/b/q;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/e/f/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/e/f/c;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/e/c/b/q;->b:Lnet/youmi/android/a/a/e/g/h;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/f/c;->a(Lnet/youmi/android/a/a/e/g/h;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
