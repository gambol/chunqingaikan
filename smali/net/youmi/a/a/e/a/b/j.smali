.class public abstract Lnet/youmi/android/a/a/e/a/b/j;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/a/a/e/a/b/g;


# instance fields
.field protected a:Lnet/youmi/android/a/a/e/a/b/i;

.field protected b:Lnet/youmi/android/a/a/e/a/a/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x3

    invoke-static {v0}, Lnet/youmi/android/a/a/e/a/b/j;->b(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(I)Lorg/json/JSONObject;
    .locals 2

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "c"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(I)Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/a/e/a/b/j;->a(I)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method


# virtual methods
.method public a(Lnet/youmi/android/a/a/e/a/a/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/a/b/j;->b:Lnet/youmi/android/a/a/e/a/a/a;

    return-void
.end method

.method public a(Lnet/youmi/android/a/a/e/a/b/i;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/a/b/j;->a:Lnet/youmi/android/a/a/e/a/b/i;

    return-void
.end method
