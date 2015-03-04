.class public Lnet/youmi/android/offers/d/c/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Lnet/youmi/android/offers/d/c/b;


# direct methods
.method public static a()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lnet/youmi/android/offers/d/c/a;->a:Lnet/youmi/android/offers/d/c/b;

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lnet/youmi/android/offers/d/c/a;->a:Lnet/youmi/android/offers/d/c/b;

    if-nez v1, :cond_0

    new-instance v1, Lnet/youmi/android/offers/d/c/b;

    invoke-direct {v1, v0}, Lnet/youmi/android/offers/d/c/b;-><init>(Landroid/content/Context;)V

    sput-object v1, Lnet/youmi/android/offers/d/c/a;->a:Lnet/youmi/android/offers/d/c/b;

    :cond_0
    sget-object v0, Lnet/youmi/android/offers/d/c/a;->a:Lnet/youmi/android/offers/d/c/b;

    invoke-virtual {v0}, Lnet/youmi/android/offers/d/c/b;->a()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
