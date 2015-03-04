.class public Lnet/youmi/android/a/b/c/g;
.super Lnet/youmi/android/a/b/c/a;


# static fields
.field private static b:Lnet/youmi/android/a/b/c/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lnet/youmi/android/a/b/c/a;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method public static declared-synchronized f(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;
    .locals 4

    const-class v1, Lnet/youmi/android/a/b/c/g;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/b/c/g;->b:Lnet/youmi/android/a/b/c/g;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/c/g;

    const-string v2, "jqIqJYOT3JpT"

    const/4 v3, 0x2

    invoke-direct {v0, p0, v2, v3}, Lnet/youmi/android/a/b/c/g;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/a/b/c/g;->b:Lnet/youmi/android/a/b/c/g;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/a/b/c/g;->b:Lnet/youmi/android/a/b/c/g;
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
.method public bridge synthetic a()V
    .locals 0

    invoke-super {p0}, Lnet/youmi/android/a/b/c/a;->a()V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/String;[BJ)Z
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Lnet/youmi/android/a/b/c/a;->a(Ljava/lang/String;[BJ)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic a(Ljava/util/List;)Z
    .locals 1

    invoke-super {p0, p1}, Lnet/youmi/android/a/b/c/a;->a(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic a(Ljava/lang/String;)[B
    .locals 1

    invoke-super {p0, p1}, Lnet/youmi/android/a/b/c/a;->a(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/String;)Z
    .locals 1

    invoke-super {p0, p1}, Lnet/youmi/android/a/b/c/a;->b(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    invoke-super {p0, p1}, Lnet/youmi/android/a/b/c/a;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method

.method public bridge synthetic onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lnet/youmi/android/a/b/c/a;->onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V

    return-void
.end method
