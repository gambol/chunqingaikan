.class public Lnet/youmi/android/a/a/e/b/d;
.super Lnet/youmi/android/a/b/c/h;


# static fields
.field private static a:Lnet/youmi/android/a/a/e/b/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "0t6evSXr"

    invoke-static {p1}, Lnet/youmi/android/a/a/b/a;->c(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lnet/youmi/android/a/b/c/h;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/c/g;I)V

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/a/a/e/b/d;
    .locals 2

    const-class v1, Lnet/youmi/android/a/a/e/b/d;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/e/b/d;->a:Lnet/youmi/android/a/a/e/b/d;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/e/b/d;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/e/b/d;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/a/a/e/b/d;->a:Lnet/youmi/android/a/a/e/b/d;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/a/a/e/b/d;->a:Lnet/youmi/android/a/a/e/b/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lnet/youmi/android/a/a/e/b/a;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lnet/youmi/android/a/a/e/b/a;

    invoke-direct {v1, p1}, Lnet/youmi/android/a/a/e/b/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/b/a;->a()Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p0, v1}, Lnet/youmi/android/a/a/e/b/d;->b(Lnet/youmi/android/a/b/c/d;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 3

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/e/b/a;

    invoke-direct {v0, p1}, Lnet/youmi/android/a/a/e/b/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/b/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p3, p4}, Lnet/youmi/android/a/a/e/b/a;->a(J)V

    invoke-virtual {v0, p2}, Lnet/youmi/android/a/a/e/b/a;->b(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/e/b/d;->a(Lnet/youmi/android/a/b/c/d;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/util/List;)Z
    .locals 10

    const/4 v2, 0x0

    if-nez p1, :cond_0

    move v0, v2

    :goto_0
    return v0

    :cond_0
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    move v3, v2

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-ge v3, v0, :cond_8

    :try_start_1
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/e/b/a;

    if-nez v0, :cond_2

    move-object v0, v1

    :goto_2
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    move-object v1, v0

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/b/a;->a()Z

    move-result v4

    if-nez v4, :cond_3

    move-object v0, v1

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/b/a;->b()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    move-object v0, v1

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/b/a;->b()Ljava/lang/String;

    move-result-object v4

    const-string v5, "UTF-8"

    invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v4

    if-nez v4, :cond_5

    move-object v0, v1

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lnet/youmi/android/a/a/e/b/d;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lnet/youmi/android/a/a/e/b/d;->a()I

    move-result v6

    invoke-static {v4, v5, v6}, Lnet/youmi/android/a/b/c/c;->a([BLjava/lang/String;I)[B

    move-result-object v5

    if-nez v5, :cond_6

    move-object v0, v1

    goto :goto_2

    :cond_6
    if-nez v1, :cond_7

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v4

    :cond_7
    new-instance v4, Lnet/youmi/android/a/b/c/b;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/b/a;->n()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/b/a;->m()J

    move-result-wide v8

    invoke-direct {v4, v6, v5, v8, v9}, Lnet/youmi/android/a/b/c/b;-><init>(Ljava/lang/String;[BJ)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, v1

    goto :goto_2

    :cond_8
    if-nez v1, :cond_9

    move v0, v2

    goto :goto_0

    :cond_9
    :try_start_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_a

    move v0, v2

    goto :goto_0

    :cond_a
    invoke-virtual {p0}, Lnet/youmi/android/a/a/e/b/d;->b()Lnet/youmi/android/a/b/c/g;

    move-result-object v0

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/c/g;->a(Ljava/util/List;)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v2

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v0, v1

    goto :goto_2
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    :try_start_0
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/a/e/b/d;->c(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
