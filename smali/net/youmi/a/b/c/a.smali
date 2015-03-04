.class Lnet/youmi/android/a/b/c/a;
.super Landroid/database/sqlite/SQLiteOpenHelper;


# static fields
.field protected static a:Ljava/lang/String;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "YINcpuKxQ5cA"

    sput-object v0, Lnet/youmi/android/a/b/c/a;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "create table if not exists "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lnet/youmi/android/a/b/c/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(_id integer primary key autoincrement,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " text UNIQUE, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "b"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " blob, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "c"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " integer, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "d"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " integer);"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/a/b/c/a;->b:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "drop table if exists "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lnet/youmi/android/a/b/c/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/a/b/c/a;->c:Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/youmi/android/a/b/c/a;-><init>(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, p2, v1, p3}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    if-eqz p4, :cond_0

    const-string v0, ""

    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sput-object p4, Lnet/youmi/android/a/b/c/a;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private a(Landroid/content/ContentValues;Ljava/lang/String;J)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p2}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_0
.end method

.method private a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p3}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Landroid/content/ContentValues;Ljava/lang/String;[B)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p2}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-eqz p3, :cond_0

    array-length v0, p3

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    goto :goto_0
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

.method private a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/content/ContentValues;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1, p2, v1, p3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    :goto_0
    return v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=?"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p5, v3, v4

    invoke-virtual {p1, p2, p3, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    int-to-long v2, v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method private a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 10

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v2, 0x0

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p4, v4, v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    move-object v1, p2

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    invoke-direct {p0, v1}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/Cursor;)V

    :goto_0
    return v0

    :catch_0
    move-exception v0

    move-object v0, v9

    :goto_1
    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/Cursor;)V

    move v0, v8

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_2
    invoke-direct {p0, v9}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/Cursor;)V

    throw v0

    :catchall_1
    move-exception v0

    move-object v9, v1

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v0, v1

    goto :goto_1
.end method

.method private b(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    :try_start_0
    invoke-direct {p0, p1}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

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
.method public a()V
    .locals 9

    const-string v2, "locking"

    monitor-enter v2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/c/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v0

    :try_start_1
    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-object v1, Lnet/youmi/android/a/b/c/a;->a:Ljava/lang/String;

    const-string v3, "d<? and d>?"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v6, v7

    const/4 v4, 0x1

    const-string v5, "-1"

    aput-object v5, v6, v4

    invoke-virtual {v0, v1, v3, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    :goto_0
    monitor-exit v2

    return-void

    :catch_0
    move-exception v1

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    :goto_1
    :try_start_3
    invoke-direct {p0, v1}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_2
    move-exception v1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_1
.end method

.method public a(Ljava/lang/String;[BJ)Z
    .locals 11

    const/4 v6, 0x0

    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v6

    :goto_0
    return v0

    :cond_0
    if-eqz p2, :cond_1

    array-length v0, p2

    if-nez v0, :cond_2

    :cond_1
    move v0, v6

    goto :goto_0

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const-wide/16 v0, -0x1

    const-wide/16 v2, 0x0

    cmp-long v2, p3, v2

    if-lez v2, :cond_5

    add-long v0, v8, p3

    move-wide v4, v0

    :goto_1
    const-string v7, "locking"

    monitor-enter v7

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/c/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-direct {p0, v1}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_3
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    const-string v0, "a"

    invoke-direct {p0, v3, v0, p1}, Lnet/youmi/android/a/b/c/a;->a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-direct {p0, v3, v0, p2}, Lnet/youmi/android/a/b/c/a;->a(Landroid/content/ContentValues;Ljava/lang/String;[B)V

    const-string v0, "c"

    invoke-direct {p0, v3, v0, v8, v9}, Lnet/youmi/android/a/b/c/a;->a(Landroid/content/ContentValues;Ljava/lang/String;J)V

    const-string v0, "d"

    invoke-direct {p0, v3, v0, v4, v5}, Lnet/youmi/android/a/b/c/a;->a(Landroid/content/ContentValues;Ljava/lang/String;J)V

    sget-object v0, Lnet/youmi/android/a/b/c/a;->a:Ljava/lang/String;

    const-string v2, "a"

    invoke-direct {p0, v1, v0, v2, p1}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v2, Lnet/youmi/android/a/b/c/a;->a:Ljava/lang/String;

    const-string v4, "a"

    move-object v0, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v0

    :goto_2
    :try_start_1
    invoke-direct {p0, v1}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    :goto_3
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_4
    :try_start_2
    sget-object v0, Lnet/youmi/android/a/b/c/a;->a:Ljava/lang/String;

    invoke-direct {p0, v1, v0, v3}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/content/ContentValues;)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result v0

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_3
    invoke-direct {p0, v1}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    move v0, v6

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-direct {p0, v1}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_5
    move-wide v4, v0

    goto :goto_1
.end method

.method public a(Ljava/util/List;)Z
    .locals 24

    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_1

    :cond_0
    const/4 v4, 0x0

    :goto_0
    return v4

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    const-wide/16 v12, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const-string v17, "locking"

    monitor-enter v17

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lnet/youmi/android/a/b/c/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_2
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    const/4 v4, 0x0

    move/from16 v16, v4

    :goto_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v4

    move/from16 v0, v16

    if-ge v0, v4, :cond_8

    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/youmi/android/a/b/c/b;

    invoke-virtual {v4}, Lnet/youmi/android/a/b/c/b;->b()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    move v4, v10

    move-wide v8, v12

    :goto_2
    add-int/lit8 v7, v16, 0x1

    move/from16 v16, v7

    move v10, v4

    move-wide v12, v8

    goto :goto_1

    :cond_3
    invoke-virtual {v4}, Lnet/youmi/android/a/b/c/b;->a()[B

    move-result-object v8

    if-nez v8, :cond_4

    move v4, v10

    move-wide v8, v12

    goto :goto_2

    :cond_4
    array-length v7, v8

    if-nez v7, :cond_5

    move v4, v10

    move-wide v8, v12

    goto :goto_2

    :cond_5
    array-length v7, v8

    int-to-long v14, v7

    add-long/2addr v12, v14

    const-wide/16 v14, -0x1

    invoke-virtual {v4}, Lnet/youmi/android/a/b/c/b;->c()J

    move-result-wide v20

    const-wide/16 v22, 0x0

    cmp-long v7, v20, v22

    if-lez v7, :cond_6

    invoke-virtual {v4}, Lnet/youmi/android/a/b/c/b;->c()J

    move-result-wide v14

    add-long v14, v14, v18

    :cond_6
    add-int/lit8 v11, v6, 0x1

    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    const-string v4, "a"

    move-object/from16 v0, p0

    invoke-direct {v0, v7, v4, v9}, Lnet/youmi/android/a/b/c/a;->a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "b"

    move-object/from16 v0, p0

    invoke-direct {v0, v7, v4, v8}, Lnet/youmi/android/a/b/c/a;->a(Landroid/content/ContentValues;Ljava/lang/String;[B)V

    const-string v4, "c"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    move-object/from16 v0, p0

    move-wide/from16 v1, v20

    invoke-direct {v0, v7, v4, v1, v2}, Lnet/youmi/android/a/b/c/a;->a(Landroid/content/ContentValues;Ljava/lang/String;J)V

    const-string v4, "d"

    move-object/from16 v0, p0

    invoke-direct {v0, v7, v4, v14, v15}, Lnet/youmi/android/a/b/c/a;->a(Landroid/content/ContentValues;Ljava/lang/String;J)V

    sget-object v4, Lnet/youmi/android/a/b/c/a;->a:Ljava/lang/String;

    const-string v6, "a"

    move-object/from16 v0, p0

    invoke-direct {v0, v5, v4, v6, v9}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    sget-object v6, Lnet/youmi/android/a/b/c/a;->a:Ljava/lang/String;

    const-string v8, "a"

    move-object/from16 v4, p0

    invoke-direct/range {v4 .. v9}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c

    add-int/lit8 v4, v10, 0x1

    move v6, v11

    move-wide v8, v12

    goto :goto_2

    :cond_7
    sget-object v4, Lnet/youmi/android/a/b/c/a;->a:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-direct {v0, v5, v4, v7}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/content/ContentValues;)Z

    move-result v4

    if-eqz v4, :cond_c

    add-int/lit8 v4, v10, 0x1

    move v6, v11

    move-wide v8, v12

    goto :goto_2

    :cond_8
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 v4, 0x1

    if-eqz v5, :cond_9

    :try_start_1
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_9
    :try_start_2
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    :goto_3
    monitor-exit v17

    goto/16 :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v17
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v4

    :catch_0
    move-exception v6

    :try_start_3
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    goto :goto_3

    :catchall_1
    move-exception v4

    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_1
    move-exception v4

    if-eqz v5, :cond_a

    :try_start_4
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_a
    :try_start_5
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    :goto_4
    monitor-exit v17

    const/4 v4, 0x0

    goto/16 :goto_0

    :catch_2
    move-exception v4

    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    goto :goto_4

    :catchall_2
    move-exception v4

    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_3
    move-exception v4

    if-eqz v5, :cond_b

    :try_start_6
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :cond_b
    :try_start_7
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    :goto_5
    throw v4

    :catch_3
    move-exception v6

    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    goto :goto_5

    :catchall_4
    move-exception v4

    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lnet/youmi/android/a/b/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_c
    move v4, v10

    move v6, v11

    move-wide v8, v12

    goto/16 :goto_2
.end method

.method public a(Ljava/lang/String;)[B
    .locals 13

    const/4 v8, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const-string v9, "locking"

    monitor-enter v9

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/c/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v0

    :try_start_1
    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_0
    sget-object v1, Lnet/youmi/android/a/b/c/a;->a:Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "a=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-result-object v1

    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "b"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getBlob(I)[B
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-result-object v2

    :try_start_3
    const-string v3, "d"

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-result-wide v6

    const-wide/16 v10, 0x0

    cmp-long v3, v4, v10

    if-lez v3, :cond_1

    cmp-long v3, v4, v6

    if-gez v3, :cond_1

    :try_start_4
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/c/a;->b(Ljava/lang/String;)Z
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move-object v2, v8

    :cond_1
    :goto_0
    :try_start_5
    invoke-direct {p0, v1}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-object v1, v2

    :goto_1
    monitor-exit v9

    return-object v1

    :catch_0
    move-exception v2

    move-object v2, v8

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v0, v8

    move-object v1, v8

    :goto_2
    invoke-direct {p0, v8}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    move-object v1, v8

    :goto_3
    :try_start_6
    invoke-direct {p0, v1}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v8}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_2
    move-exception v1

    move-object v12, v1

    move-object v1, v8

    move-object v8, v0

    move-object v0, v12

    goto :goto_3

    :catchall_3
    move-exception v2

    move-object v8, v0

    move-object v0, v2

    goto :goto_3

    :catch_2
    move-exception v1

    move-object v1, v8

    goto :goto_2

    :catch_3
    move-exception v2

    move-object v12, v1

    move-object v1, v8

    move-object v8, v12

    goto :goto_2

    :catch_4
    move-exception v3

    move-object v8, v1

    move-object v1, v2

    goto :goto_2

    :cond_2
    move-object v2, v8

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)Z
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v3, "locking"

    monitor-enter v3

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/c/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    :try_start_1
    invoke-direct {p0, v2}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_0
    sget-object v4, Lnet/youmi/android/a/b/c/a;->a:Ljava/lang/String;

    const-string v5, "a =? "

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object p1, v6, v7

    invoke-virtual {v2, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v4

    if-lez v4, :cond_1

    :goto_0
    :try_start_2
    invoke-direct {p0, v2}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    :goto_1
    monitor-exit v3

    return v0

    :cond_1
    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v2

    :goto_2
    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    move v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-direct {p0, v2}, Lnet/youmi/android/a/b/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :catch_1
    move-exception v0

    move-object v0, v2

    goto :goto_2
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    sget-object v0, Lnet/youmi/android/a/b/c/a;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    sget-object v0, Lnet/youmi/android/a/b/c/a;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lnet/youmi/android/a/b/c/a;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method
