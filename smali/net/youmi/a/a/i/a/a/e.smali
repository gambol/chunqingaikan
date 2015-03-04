.class public Lnet/youmi/android/a/a/i/a/a/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Lnet/youmi/android/a/a/e/g/g;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lnet/youmi/android/a/a/e/g/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/a/e;->a:Landroid/app/Activity;

    iput-object p2, p0, Lnet/youmi/android/a/a/i/a/a/e;->b:Lnet/youmi/android/a/a/e/g/g;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/e;->a:Landroid/app/Activity;

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/e;->b:Lnet/youmi/android/a/a/e/g/g;

    invoke-static {v0, v1}, Lnet/youmi/android/a/a/i/a/a/d;->b(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/g;)Lnet/youmi/android/a/a/i/a/a/d;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/a/d;->show()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
