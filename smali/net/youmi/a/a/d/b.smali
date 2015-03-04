.class public Lnet/youmi/android/a/a/d/b;
.super Lnet/youmi/android/a/b/g/b;


# static fields
.field private static a:Lnet/youmi/android/a/a/d/b;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/b/g/c/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lnet/youmi/android/a/b/g/b;-><init>(Landroid/content/Context;Lnet/youmi/android/a/b/g/c/a;)V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lnet/youmi/android/a/a/d/b;
    .locals 3

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/d/b;->a:Lnet/youmi/android/a/a/d/b;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/d/b;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lnet/youmi/android/a/a/d/a/b;->a(Landroid/content/Context;I)Lnet/youmi/android/a/a/d/a/a;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lnet/youmi/android/a/a/d/b;-><init>(Landroid/content/Context;Lnet/youmi/android/a/b/g/c/a;)V

    sput-object v1, Lnet/youmi/android/a/a/d/b;->a:Lnet/youmi/android/a/a/d/b;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    sget-object v0, Lnet/youmi/android/a/a/d/b;->a:Lnet/youmi/android/a/a/d/b;

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
