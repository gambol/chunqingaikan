.class public Lnet/youmi/android/a/b/i/f;
.super Ljava/lang/Object;


# static fields
.field public static a:Ljava/lang/String;

.field protected static b:I

.field protected static c:Ljava/lang/String;

.field protected static d:I

.field protected static e:Ljava/lang/String;

.field protected static f:I

.field protected static g:Ljava/lang/String;

.field protected static h:I

.field public static i:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    const-string v0, ""

    sput-object v0, Lnet/youmi/android/a/b/i/f;->a:Ljava/lang/String;

    sput v1, Lnet/youmi/android/a/b/i/f;->b:I

    const-string v0, ""

    sput-object v0, Lnet/youmi/android/a/b/i/f;->c:Ljava/lang/String;

    sput v1, Lnet/youmi/android/a/b/i/f;->d:I

    const-string v0, ""

    sput-object v0, Lnet/youmi/android/a/b/i/f;->e:Ljava/lang/String;

    sput v1, Lnet/youmi/android/a/b/i/f;->f:I

    const-string v0, ""

    sput-object v0, Lnet/youmi/android/a/b/i/f;->g:Ljava/lang/String;

    sput v1, Lnet/youmi/android/a/b/i/f;->h:I

    const-wide/16 v0, 0x0

    sput-wide v0, Lnet/youmi/android/a/b/i/f;->i:J

    return-void
.end method

.method private static a()V
    .locals 2

    const/4 v1, 0x3

    const-string v0, "exrep.youmi.net"

    sput-object v0, Lnet/youmi/android/a/b/i/f;->a:Ljava/lang/String;

    const/16 v0, 0x138a

    sput v0, Lnet/youmi/android/a/b/i/f;->b:I

    const-string v0, "tcp"

    sput-object v0, Lnet/youmi/android/a/b/i/f;->c:Ljava/lang/String;

    sput v1, Lnet/youmi/android/a/b/i/f;->d:I

    const-string v0, "tcp"

    sput-object v0, Lnet/youmi/android/a/b/i/f;->g:Ljava/lang/String;

    sput v1, Lnet/youmi/android/a/b/i/f;->h:I

    const-string v0, "tcp"

    sput-object v0, Lnet/youmi/android/a/b/i/f;->e:Ljava/lang/String;

    sput v1, Lnet/youmi/android/a/b/i/f;->f:I

    return-void
.end method

.method public static a(Landroid/content/Context;Lorg/json/JSONObject;)V
    .locals 3

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/b/i/f;->a()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    sget-object v0, Lnet/youmi/android/a/b/i/f;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/a/b/i/f;->a:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_1
    return-void

    :cond_1
    :try_start_1
    const-string v1, ""

    const-string v0, "udp"

    invoke-static {p0}, Lnet/youmi/android/a/b/i/k;->b(Landroid/content/Context;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :goto_2
    invoke-static {v1}, Lnet/youmi/android/a/b/i/f;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "udp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Lnet/youmi/android/a/b/i/f;->a:Ljava/lang/String;

    sget v1, Lnet/youmi/android/a/b/i/f;->b:I

    invoke-static {p0, p1, v0, v1}, Lnet/youmi/android/a/b/i/h;->a(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;I)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_1

    :pswitch_0
    const-string v1, "2g"

    sget-object v0, Lnet/youmi/android/a/b/i/f;->g:Ljava/lang/String;

    goto :goto_2

    :pswitch_1
    const-string v1, "3g"

    sget-object v0, Lnet/youmi/android/a/b/i/f;->e:Ljava/lang/String;

    goto :goto_2

    :pswitch_2
    const-string v1, "wifi"

    sget-object v0, Lnet/youmi/android/a/b/i/f;->c:Ljava/lang/String;

    goto :goto_2

    :cond_2
    const-string v1, "tcp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/a/b/i/f;->a:Ljava/lang/String;

    sget v1, Lnet/youmi/android/a/b/i/f;->b:I

    invoke-static {p0, p1, v0, v1}, Lnet/youmi/android/a/b/i/g;->a(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method protected static a(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x1

    const/16 v1, 0x64

    invoke-static {v1}, Lnet/youmi/android/a/b/b/d;->a(I)I

    move-result v1

    const-string v2, "wifi"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget v2, Lnet/youmi/android/a/b/i/f;->d:I

    if-ge v1, v2, :cond_2

    :cond_0
    :goto_0
    return v0

    :cond_1
    const-string v2, "3g"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    sget v2, Lnet/youmi/android/a/b/i/f;->f:I

    if-lt v1, v2, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    const-string v2, "2g"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget v2, Lnet/youmi/android/a/b/i/f;->h:I

    if-ge v1, v2, :cond_2

    goto :goto_0
.end method
