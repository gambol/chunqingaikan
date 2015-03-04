.class public Lnet/youmi/android/a/b/g/f/d;
.super Lnet/youmi/android/a/b/g/f/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x6b

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/g/f/a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lnet/youmi/android/a/b/g/a/d;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/e;)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Lnet/youmi/android/a/b/g/f/a;->a(Landroid/content/Context;Lnet/youmi/android/a/b/g/a/d;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/e;)V

    :try_start_0
    invoke-interface {p4, p3}, Lnet/youmi/android/a/b/g/d/e;->e(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
