.class public Lnet/youmi/android/c/a/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field private static final f:Ljava/lang/String;

.field private static final g:Ljava/lang/String;

.field private static final h:Ljava/lang/String;

.field private static final i:Ljava/lang/String;

.field private static final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lnet/youmi/android/c/a/c;->h()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/b;->f:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/c/a/c;->i()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/b;->g:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/c/a/c;->j()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/b;->a:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/c/a/c;->k()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/b;->b:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/c/a/c;->l()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/b;->h:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/c/a/c;->m()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/b;->i:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/c/a/c;->n()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/b;->c:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/c/a/c;->o()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/b;->j:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/c/a/c;->p()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/b;->d:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/c/a/c;->q()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/b;->e:Ljava/lang/String;

    return-void
.end method

.method public static final a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 4

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/b;->g:Ljava/lang/String;

    const/16 v1, 0x1f4

    invoke-static {p0, v0, p1, v1}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "request spot url:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p2, :cond_0

    const-string v1, "SDKChecking"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "your request url is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const-string v1, ""
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance v2, Lnet/youmi/android/a/b/i/a/b;

    invoke-direct {v2}, Lnet/youmi/android/a/b/i/a/b;-><init>()V

    const/16 v3, 0x1f4

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/b/i/a/b;->a(I)V

    const-string v3, "st"

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/b/i/a/b;->a(Ljava/lang/String;)V

    const-string v3, "a_st_req"

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/b/i/a/b;->b(Ljava/lang/String;)V

    invoke-static {p0, v0, v2}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    :goto_0
    :try_start_2
    const-string v1, "request spot result:%s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    const-string v2, "Throw"

    invoke-static {v2, v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    move-object v0, v1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/b/e/b;->b(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, p1}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;)Ljava/lang/String;

    move-result-object v2

    const-string v0, ""
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v3, Lnet/youmi/android/a/b/i/a/b;

    invoke-direct {v3}, Lnet/youmi/android/a/b/i/a/b;-><init>()V

    const/16 v4, 0x1f4

    invoke-virtual {v3, v4}, Lnet/youmi/android/a/b/i/a/b;->a(I)V

    const-string v4, "st"

    invoke-virtual {v3, v4}, Lnet/youmi/android/a/b/i/a/b;->a(Ljava/lang/String;)V

    const-string v4, "a_st_shw_clk"

    invoke-virtual {v3, v4}, Lnet/youmi/android/a/b/i/a/b;->b(Ljava/lang/String;)V

    invoke-static {p0, v2, v3}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "pings"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-eqz v3, :cond_0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v1, v3, :cond_0

    const/4 v3, 0x0

    const-string v4, ""

    invoke-static {v2, v3, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONArray;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lnet/youmi/android/a/b/i/a/b;

    invoke-direct {v4}, Lnet/youmi/android/a/b/i/a/b;-><init>()V

    invoke-static {p0, v3, v4}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {v1}, Lnet/youmi/android/a/b/e/b;->b(Ljava/lang/Throwable;)V

    :cond_0
    :goto_1
    return-object v0

    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method public static final a(Landroid/content/Context;Lnet/youmi/android/banner/AdSize;)Ljava/lang/String;
    .locals 4

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "h="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lnet/youmi/android/banner/AdSize;->getAdHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "&w="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lnet/youmi/android/banner/AdSize;->getAdWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/d/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lnet/youmi/android/c/a/b;->f:Ljava/lang/String;

    const/16 v2, 0x1f4

    const-string v3, "00001"

    invoke-static {p0, v1, v0, v2, v3}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance v2, Lnet/youmi/android/a/b/i/a/b;

    invoke-direct {v2}, Lnet/youmi/android/a/b/i/a/b;-><init>()V

    const/16 v3, 0x1f4

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/b/i/a/b;->a(I)V

    const-string v3, "br"

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/b/i/a/b;->a(Ljava/lang/String;)V

    const-string v3, "a_br_req"

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/b/i/a/b;->b(Ljava/lang/String;)V

    invoke-static {p0, v0, v2}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    :goto_0
    :try_start_2
    const-string v1, "request spot result:%s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    const-string v2, "Throw"

    invoke-static {v2, v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    move-object v0, v1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/b/e/b;->b(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_1
.end method
