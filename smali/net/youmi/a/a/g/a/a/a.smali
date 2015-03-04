.class public Lnet/youmi/android/a/a/g/a/a/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Lnet/youmi/android/a/a/g/a/a/a;

.field private static b:Lnet/youmi/android/a/a/g/a/a/b;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Context must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lnet/youmi/android/a/a/g/a/a/b;

    invoke-direct {v0, p1}, Lnet/youmi/android/a/a/g/a/a/b;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/a/a/g/a/a/a;->b:Lnet/youmi/android/a/a/g/a/a/b;

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/a;
    .locals 3

    const-class v1, Lnet/youmi/android/a/a/g/a/a/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/g/a/a/a;->a:Lnet/youmi/android/a/a/g/a/a/a;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/g/a/a/a;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lnet/youmi/android/a/a/g/a/a/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/a/a/g/a/a/a;->a:Lnet/youmi/android/a/a/g/a/a/a;

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/g/a/a/a;->a:Lnet/youmi/android/a/a/g/a/a/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private a(Landroid/database/Cursor;)V
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Landroid/database/sqlite/SQLiteDatabase;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    goto :goto_0
.end method

.method private b(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    :try_start_0
    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lnet/youmi/android/a/a/g/a/b/a;
    .locals 10

    const/4 v0, 0x0

    if-nez p1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    const-string v4, "lock"

    monitor-enter v4

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lnet/youmi/android/a/a/g/a/a/a;->b:Lnet/youmi/android/a/a/g/a/a/b;

    invoke-virtual {v2}, Lnet/youmi/android/a/a/g/a/a/b;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    :try_start_1
    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-result v2

    if-nez v2, :cond_1

    :try_start_2
    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_1
    :try_start_3
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Android"

    invoke-static {v1, v2}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SELECT * FROM b5I3kl9i WHERE g=?"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    invoke-virtual {v3, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result-object v2

    :try_start_4
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move-result v1

    if-nez v1, :cond_2

    :try_start_5
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :cond_2
    :try_start_6
    new-instance v1, Lnet/youmi/android/a/a/g/a/b/a;

    invoke-direct {v1}, Lnet/youmi/android/a/a/g/a/b/a;-><init>()V

    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "a"

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "b"

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lnet/youmi/android/a/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "f"

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lnet/youmi/android/a/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "g"

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "Android"

    invoke-static {v6, v9}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v9, "Android"

    invoke-static {v7, v9}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "Android"

    invoke-static {v8, v9}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v5}, Lnet/youmi/android/a/a/g/a/b/a;->a(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Lnet/youmi/android/a/a/g/a/b/a;->b(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Lnet/youmi/android/a/a/g/a/b/a;->c(Ljava/lang/String;)V

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v1, v6}, Lnet/youmi/android/a/a/g/a/b/a;->a(I)V

    const-string v6, "c"

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    invoke-virtual {v1, v6}, Lnet/youmi/android/a/a/g/a/b/a;->b(I)V

    const-string v6, "d"

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    invoke-virtual {v1, v6}, Lnet/youmi/android/a/a/g/a/b/a;->c(I)V

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v6

    const/4 v7, 0x3

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/a;->d()I

    move-result v8

    invoke-virtual {v6, v5, v7, v8}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v6

    const/16 v7, 0xd

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/a;->e()I

    move-result v8

    invoke-virtual {v6, v5, v7, v8}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V

    const-string v5, "e"

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    invoke-virtual {v1, v5}, Lnet/youmi/android/a/a/g/a/b/a;->d(I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :cond_3
    :try_start_7
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v4

    move-object v0, v1

    goto/16 :goto_0

    :catch_0
    move-exception v1

    move-object v1, v0

    move-object v2, v0

    :goto_1
    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v4

    goto/16 :goto_0

    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v3, v0

    move-object v0, v1

    :goto_2
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catchall_2
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto :goto_2

    :catchall_3
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v1

    move-object v1, v0

    move-object v2, v3

    goto :goto_1

    :catch_2
    move-exception v1

    move-object v1, v2

    move-object v2, v3

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)Lnet/youmi/android/a/a/g/a/b/a;
    .locals 9

    const/4 v0, 0x0

    if-nez p1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    const-string v4, "lock"

    monitor-enter v4

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lnet/youmi/android/a/a/g/a/a/a;->b:Lnet/youmi/android/a/a/g/a/a/b;

    invoke-virtual {v2}, Lnet/youmi/android/a/a/g/a/a/b;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    :try_start_1
    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-result v2

    if-nez v2, :cond_1

    :try_start_2
    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_1
    :try_start_3
    const-string v1, "SELECT * FROM b5I3kl9i WHERE a=?"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v2, v5

    invoke-virtual {v3, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result-object v2

    :try_start_4
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move-result v1

    if-nez v1, :cond_2

    :try_start_5
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :cond_2
    :try_start_6
    new-instance v1, Lnet/youmi/android/a/a/g/a/b/a;

    invoke-direct {v1}, Lnet/youmi/android/a/a/g/a/b/a;-><init>()V

    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "a"

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lnet/youmi/android/a/a/g/a/b/a;->a(Ljava/lang/String;)V

    const-string v5, "b"

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnet/youmi/android/a/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "f"

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lnet/youmi/android/a/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "g"

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Android"

    invoke-static {v5, v8}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v8, "Android"

    invoke-static {v6, v8}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "Android"

    invoke-static {v7, v8}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v5}, Lnet/youmi/android/a/a/g/a/b/a;->b(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Lnet/youmi/android/a/a/g/a/b/a;->c(Ljava/lang/String;)V

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v1, v5}, Lnet/youmi/android/a/a/g/a/b/a;->a(I)V

    const-string v5, "c"

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    invoke-virtual {v1, v5}, Lnet/youmi/android/a/a/g/a/b/a;->b(I)V

    const-string v5, "d"

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    invoke-virtual {v1, v5}, Lnet/youmi/android/a/a/g/a/b/a;->c(I)V

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v5

    const/4 v6, 0x3

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/a;->d()I

    move-result v7

    invoke-virtual {v5, p1, v6, v7}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v5

    const/16 v6, 0xd

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/a;->e()I

    move-result v7

    invoke-virtual {v5, p1, v6, v7}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V

    const-string v5, "e"

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    invoke-virtual {v1, v5}, Lnet/youmi/android/a/a/g/a/b/a;->d(I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :cond_3
    :try_start_7
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v4

    move-object v0, v1

    goto/16 :goto_0

    :catch_0
    move-exception v1

    move-object v1, v0

    move-object v2, v0

    :goto_1
    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v4

    goto/16 :goto_0

    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v3, v0

    move-object v0, v1

    :goto_2
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catchall_2
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto :goto_2

    :catchall_3
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v1

    move-object v1, v0

    move-object v2, v3

    goto :goto_1

    :catch_2
    move-exception v1

    move-object v1, v2

    move-object v2, v3

    goto :goto_1
.end method

.method public a(Ljava/util/List;)Z
    .locals 14

    const-wide/16 v6, -0x1

    const/4 v0, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-gtz v3, :cond_1

    :cond_0
    move v0, v1

    :goto_0
    return v0

    :cond_1
    const-string v8, "lock"

    monitor-enter v8

    :try_start_0
    sget-object v3, Lnet/youmi/android/a/a/g/a/a/a;->b:Lnet/youmi/android/a/a/g/a/a/b;

    invoke-virtual {v3}, Lnet/youmi/android/a/a/g/a/a/b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    :try_start_1
    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-result v0

    if-nez v0, :cond_2

    :try_start_2
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move v0, v1

    goto :goto_0

    :cond_2
    :try_start_3
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_3
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/g/a/b/a;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->a()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lnet/youmi/android/a/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->g()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnet/youmi/android/a/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->b()I

    move-result v10

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "Android"

    invoke-static {v4, v11}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v11, "Android"

    invoke-static {v5, v11}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v11, "Android"

    invoke-static {v10, v11}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Landroid/content/ContentValues;

    invoke-direct {v11}, Landroid/content/ContentValues;-><init>()V

    const-string v12, "a"

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->a()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v12, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v12, "b"

    invoke-virtual {v11, v12, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "c"

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->d()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11, v4, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v4, "d"

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->e()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11, v4, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v4, "e"

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->f()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11, v4, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v4, "f"

    invoke-virtual {v11, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "g"

    invoke-virtual {v11, v4, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    const-string v4, "b5I3kl9i"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5, v11}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-result-wide v4

    :goto_2
    cmp-long v4, v6, v4

    if-nez v4, :cond_3

    :try_start_5
    const-string v4, "b5I3kl9i"

    const-string v5, "a=?"

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/String;

    const/4 v12, 0x0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->a()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v10, v12

    invoke-virtual {v3, v4, v11, v5, v10}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_3

    goto/16 :goto_1

    :catch_0
    move-exception v4

    move-wide v4, v6

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v8

    move v0, v2

    goto/16 :goto_0

    :catch_1
    move-exception v2

    :goto_3
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v8

    move v0, v1

    goto/16 :goto_0

    :catchall_0
    move-exception v1

    move-object v3, v0

    move-object v0, v1

    :goto_4
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    invoke-direct {p0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v0

    :catchall_2
    move-exception v0

    goto :goto_4

    :catch_2
    move-exception v0

    move-object v0, v3

    goto :goto_3
.end method

.method public a(Lnet/youmi/android/a/a/g/a/b/a;)Z
    .locals 11

    const-wide/16 v4, -0x1

    const/4 v1, 0x0

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->a()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const-string v6, "lock"

    monitor-enter v6

    :try_start_0
    sget-object v2, Lnet/youmi/android/a/a/g/a/a/a;->b:Lnet/youmi/android/a/a/g/a/a/b;

    invoke-virtual {v2}, Lnet/youmi/android/a/a/g/a/a/b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v2

    if-nez v2, :cond_2

    :try_start_1
    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_2
    :try_start_2
    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/youmi/android/a/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/youmi/android/a/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->b()I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Android"

    invoke-static {v2, v8}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v8, "Android"

    invoke-static {v3, v8}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v8, "Android"

    invoke-static {v7, v8}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    const-string v9, "a"

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "b"

    invoke-virtual {v8, v9, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "c"

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->d()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v2, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "d"

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->e()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v2, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "e"

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->f()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v2, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "f"

    invoke-virtual {v8, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "g"

    invoke-virtual {v8, v2, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    const-string v2, "b5I3kl9i"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v8}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-wide v2

    :goto_1
    cmp-long v2, v4, v2

    if-nez v2, :cond_3

    :try_start_4
    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v6

    goto/16 :goto_0

    :catch_0
    move-exception v2

    move-wide v2, v4

    goto :goto_1

    :cond_3
    const/4 v0, 0x1

    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v6

    goto/16 :goto_0

    :catch_1
    move-exception v2

    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v6

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method

.method public b(Lnet/youmi/android/a/a/g/a/b/a;)Z
    .locals 10

    const/4 v1, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->a()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const-string v3, "lock"

    monitor-enter v3

    const/4 v2, 0x0

    :try_start_0
    sget-object v4, Lnet/youmi/android/a/a/g/a/a/a;->b:Lnet/youmi/android/a/a/g/a/a/b;

    invoke-virtual {v4}, Lnet/youmi/android/a/a/g/a/a/b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v2

    :try_start_1
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v4

    if-nez v4, :cond_2

    :try_start_2
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_2
    :try_start_3
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->d()I

    move-result v5

    if-ne v5, v1, :cond_3

    const-string v5, "c"

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->d()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :cond_3
    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->e()I

    move-result v5

    if-ne v5, v1, :cond_4

    const-string v5, "d"

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->e()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :cond_4
    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->f()I

    move-result v5

    const/4 v6, 0x5

    if-eq v5, v6, :cond_5

    const-string v5, "e"

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->f()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :cond_5
    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->g()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_6

    const-string v6, ""

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    invoke-static {v5}, Lnet/youmi/android/a/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Android"

    invoke-static {v5, v6}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "f"

    invoke-virtual {v4, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    invoke-virtual {v4}, Landroid/content/ContentValues;->size()I
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result v5

    if-gtz v5, :cond_7

    :try_start_4
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    :cond_7
    :try_start_5
    const-string v5, "b5I3kl9i"

    const-string v6, "a=?"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/String;

    const/4 v8, 0x0

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/a/b/a;->a()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-virtual {v2, v5, v4, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result v4

    if-eqz v4, :cond_8

    :try_start_6
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v3

    move v0, v1

    goto/16 :goto_0

    :cond_8
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    :goto_1
    monitor-exit v3

    goto/16 :goto_0

    :catch_0
    move-exception v1

    move-object v1, v2

    :goto_2
    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catch_1
    move-exception v1

    move-object v1, v2

    goto :goto_2
.end method
