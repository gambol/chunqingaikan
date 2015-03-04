.class Lnet/youmi/android/a/a/g/e/k;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/e/k;->a:Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public run()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/k;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/b/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/b/c/g;->a()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_5

    :goto_0
    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/k;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/b/a;->f(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/b/c/g;->a()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_4

    :goto_1
    :try_start_2
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/k;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/b/a;->b(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/b/c/g;->a()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_3

    :goto_2
    :try_start_3
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/k;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/b/a;->c(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/b/c/g;->a()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2

    :goto_3
    :try_start_4
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/k;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/b/a;->d(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/b/c/g;->a()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1

    :goto_4
    :try_start_5
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/k;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/b/a;->e(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/b/c/g;->a()V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0

    :goto_5
    return-void

    :catch_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_4

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_2

    :catch_4
    move-exception v0

    goto :goto_1

    :catch_5
    move-exception v0

    goto :goto_0
.end method
