.class public Lnet/youmi/android/a/a/g/e/l;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/e/l;->a:Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iput-boolean p2, p0, Lnet/youmi/android/a/a/g/e/l;->b:Z

    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/l;->a:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/e/l;->a:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/a/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Lnet/youmi/android/a/a/g/e/l;->b:Z

    const-wide/16 v4, -0x1

    invoke-static {v0, v1, v2, v4, v5}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;ZJ)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_0
    return-void
.end method
