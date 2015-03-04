.class Lnet/youmi/android/a/a/g/d/a/b;
.super Ljava/lang/Object;


# static fields
.field private static a:Lnet/youmi/android/a/a/g/d/a/b;

.field private static b:Lnet/youmi/android/a/a/g/d/a/c;


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
    new-instance v0, Lnet/youmi/android/a/a/g/d/a/c;

    invoke-direct {v0, p1}, Lnet/youmi/android/a/a/g/d/a/c;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/a/a/g/d/a/b;->b:Lnet/youmi/android/a/a/g/d/a/c;

    return-void
.end method

.method static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/b;
    .locals 3

    const-class v1, Lnet/youmi/android/a/a/g/d/a/b;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/g/d/a/b;->a:Lnet/youmi/android/a/a/g/d/a/b;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/g/d/a/b;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lnet/youmi/android/a/a/g/d/a/b;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/a/a/g/d/a/b;->a:Lnet/youmi/android/a/a/g/d/a/b;

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/g/d/a/b;->a:Lnet/youmi/android/a/a/g/d/a/b;
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
    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

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
.method a(Ljava/lang/String;)Lnet/youmi/android/a/a/g/d/a/d;
    .locals 10

    const/4 v8, 0x0

    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v8

    :goto_0
    return-object v0

    :cond_0
    const-string v9, "lock"

    monitor-enter v9

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/g/d/a/b;->b:Lnet/youmi/android/a/a/g/d/a/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/d/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :try_start_1
    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/database/sqlite/SQLiteDatabase;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-result v1

    if-nez v1, :cond_1

    :try_start_2
    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v0, v8

    goto :goto_0

    :cond_1
    :try_start_3
    const-string v1, "lock"

    invoke-static {p1, v1}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "Exj23LdkF"

    const/4 v2, 0x0

    const-string v3, "b=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "a"

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result v1

    if-nez v1, :cond_2

    :try_start_4
    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object v0, v8

    goto :goto_0

    :cond_2
    :try_start_5
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lnet/youmi/android/a/a/g/d/a/d;

    invoke-direct {v1}, Lnet/youmi/android/a/a/g/d/a/d;-><init>()V

    const-string v3, "a"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v1, Lnet/youmi/android/a/a/g/d/a/d;->a:J
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    const-string v3, "e"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v1, Lnet/youmi/android/a/a/g/d/a/d;->e:J
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_1
    :try_start_7
    const-string v3, "b"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "lock"

    invoke-static {v3, v4}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lnet/youmi/android/a/a/g/d/a/d;->b:Ljava/lang/String;

    const-string v3, "c"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "lock"

    invoke-static {v3, v4}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    iput v3, v1, Lnet/youmi/android/a/a/g/d/a/d;->c:I

    const-string v3, "d"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v1, Lnet/youmi/android/a/a/g/d/a/d;->d:J

    const-string v3, "f"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "lock"

    invoke-static {v3, v4}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lnet/youmi/android/a/a/g/d/a/d;->f:Ljava/lang/String;
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    const-string v3, "g"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v1, Lnet/youmi/android/a/a/g/d/a/d;->g:J
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_2
    :try_start_9
    const-string v3, "h"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "lock"

    invoke-static {v2, v3}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lnet/youmi/android/a/a/g/d/a/d;->h:Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v9

    move-object v0, v1

    goto/16 :goto_0

    :cond_3
    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v9

    move-object v0, v8

    goto/16 :goto_0

    :catch_0
    move-exception v0

    move-object v0, v8

    :goto_3
    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v9

    move-object v0, v8

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    :goto_4
    invoke-direct {p0, v8}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v9
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    throw v0

    :catchall_2
    move-exception v1

    move-object v8, v0

    move-object v0, v1

    goto :goto_4

    :catch_1
    move-exception v1

    goto :goto_3

    :catch_2
    move-exception v3

    goto :goto_2

    :catch_3
    move-exception v3

    goto/16 :goto_1
.end method

.method a()Z
    .locals 11

    const/4 v1, 0x1

    const/4 v0, 0x0

    const-string v3, "lock"

    monitor-enter v3

    const/4 v2, 0x0

    :try_start_0
    sget-object v4, Lnet/youmi/android/a/a/g/d/a/b;->b:Lnet/youmi/android/a/a/g/d/a/c;

    invoke-virtual {v4}, Lnet/youmi/android/a/a/g/d/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v2

    :try_start_1
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/database/sqlite/SQLiteDatabase;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v4

    if-nez v4, :cond_0

    :try_start_2
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    return v0

    :cond_0
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "Exj23LdkF"

    const-string v7, "d>? and d<?"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/String;

    const/4 v9, 0x0

    const-string v10, "0"

    aput-object v10, v8, v9

    const/4 v9, 0x1

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v8, v9

    invoke-virtual {v2, v6, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result v4

    if-eqz v4, :cond_1

    :try_start_4
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v3

    move v0, v1

    goto :goto_0

    :cond_1
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :catch_0
    move-exception v1

    move-object v1, v2

    :goto_1
    :try_start_5
    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v3

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_1
    move-exception v1

    move-object v1, v2

    goto :goto_1
.end method

.method a(Lnet/youmi/android/a/a/g/d/a/d;)Z
    .locals 14

    const-wide/16 v12, 0x0

    const-wide/16 v4, -0x1

    const/4 v1, 0x0

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/d/a/d;->a()Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const-string v6, "lock"

    monitor-enter v6

    :try_start_0
    sget-object v2, Lnet/youmi/android/a/a/g/d/a/b;->b:Lnet/youmi/android/a/a/g/d/a/c;

    invoke-virtual {v2}, Lnet/youmi/android/a/a/g/d/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/database/sqlite/SQLiteDatabase;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v2

    if-nez v2, :cond_2

    :try_start_1
    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

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
    iget-object v2, p1, Lnet/youmi/android/a/a/g/d/a/d;->b:Ljava/lang/String;

    const-string v3, "lock"

    invoke-static {v2, v3}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v7, p1, Lnet/youmi/android/a/a/g/d/a/d;->c:I

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, ""

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v7, "lock"

    invoke-static {v3, v7}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    const-string v8, "a"

    iget-wide v10, p1, Lnet/youmi/android/a/a/g/d/a/d;->a:J

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v8, "b"

    invoke-virtual {v7, v8, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "c"

    invoke-virtual {v7, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "d"

    iget-wide v8, p1, Lnet/youmi/android/a/a/g/d/a/d;->d:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v7, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-wide v2, p1, Lnet/youmi/android/a/a/g/d/a/d;->e:J

    cmp-long v2, v2, v12

    if-lez v2, :cond_3

    const-string v2, "e"

    iget-wide v8, p1, Lnet/youmi/android/a/a/g/d/a/d;->e:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v7, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_3
    iget-object v2, p1, Lnet/youmi/android/a/a/g/d/a/d;->f:Ljava/lang/String;

    invoke-static {v2}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p1, Lnet/youmi/android/a/a/g/d/a/d;->f:Ljava/lang/String;

    const-string v3, "lock"

    invoke-static {v2, v3}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "f"

    invoke-virtual {v7, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-wide v2, p1, Lnet/youmi/android/a/a/g/d/a/d;->g:J

    cmp-long v2, v2, v12

    if-lez v2, :cond_5

    const-string v2, "g"

    iget-wide v8, p1, Lnet/youmi/android/a/a/g/d/a/d;->g:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v7, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_5
    iget-object v2, p1, Lnet/youmi/android/a/a/g/d/a/d;->h:Ljava/lang/String;

    invoke-static {v2}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p1, Lnet/youmi/android/a/a/g/d/a/d;->h:Ljava/lang/String;

    const-string v3, "lock"

    invoke-static {v2, v3}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "h"

    invoke-virtual {v7, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_6
    :try_start_3
    const-string v2, "Exj23LdkF"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v7}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-wide v2

    :goto_1
    cmp-long v2, v4, v2

    if-nez v2, :cond_7

    :try_start_4
    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v6

    goto/16 :goto_0

    :catch_0
    move-exception v2

    move-wide v2, v4

    goto :goto_1

    :cond_7
    const/4 v0, 0x1

    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v6

    goto/16 :goto_0

    :catch_1
    move-exception v2

    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v6

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method

.method b()Ljava/util/List;
    .locals 10

    const/4 v8, 0x0

    const-string v9, "lock"

    monitor-enter v9

    const/4 v1, 0x0

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/g/d/a/b;->b:Lnet/youmi/android/a/a/g/d/a/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/d/a/c;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :try_start_1
    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/database/sqlite/SQLiteDatabase;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-result v2

    if-nez v2, :cond_0

    :try_start_2
    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v0, v8

    :goto_0
    return-object v0

    :cond_0
    :try_start_3
    const-string v1, "Exj23LdkF"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "a"

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result-object v2

    :try_start_4
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move-result v1

    if-nez v1, :cond_1

    :try_start_5
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-object v0, v8

    goto :goto_0

    :cond_1
    :try_start_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-result v3

    if-eqz v3, :cond_3

    :try_start_7
    new-instance v3, Lnet/youmi/android/a/a/g/d/a/d;

    invoke-direct {v3}, Lnet/youmi/android/a/a/g/d/a/d;-><init>()V

    const-string v4, "a"

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v3, Lnet/youmi/android/a/a/g/d/a/d;->a:J
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    const-string v4, "e"

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v3, Lnet/youmi/android/a/a/g/d/a/d;->e:J
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :goto_2
    :try_start_9
    iget-wide v4, v3, Lnet/youmi/android/a/a/g/d/a/d;->e:J

    iget-wide v6, v3, Lnet/youmi/android/a/a/g/d/a/d;->a:J

    cmp-long v4, v4, v6

    if-gtz v4, :cond_2

    const-string v4, "b"

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "lock"

    invoke-static {v4, v5}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lnet/youmi/android/a/a/g/d/a/d;->b:Ljava/lang/String;

    const-string v4, "c"

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "lock"

    invoke-static {v4, v5}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v3, Lnet/youmi/android/a/a/g/d/a/d;->c:I

    const-string v4, "d"

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v3, Lnet/youmi/android/a/a/g/d/a/d;->d:J

    const-string v4, "f"

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "lock"

    invoke-static {v4, v5}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lnet/youmi/android/a/a/g/d/a/d;->f:Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :try_start_a
    const-string v4, "g"

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v3, Lnet/youmi/android/a/a/g/d/a/d;->g:J
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :goto_3
    :try_start_b
    const-string v4, "h"

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "lock"

    invoke-static {v4, v5}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lnet/youmi/android/a/a/g/d/a/d;->h:Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_b
    .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    goto/16 :goto_1

    :catch_0
    move-exception v3

    goto/16 :goto_1

    :cond_3
    :try_start_c
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v9

    move-object v0, v1

    goto/16 :goto_0

    :catch_1
    move-exception v0

    move-object v0, v8

    move-object v1, v8

    :goto_4
    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v9

    move-object v0, v8

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    move-object v2, v8

    :goto_5
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/database/Cursor;)V

    invoke-direct {p0, v8}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v9
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    throw v0

    :catchall_2
    move-exception v1

    move-object v2, v8

    move-object v8, v0

    move-object v0, v1

    goto :goto_5

    :catchall_3
    move-exception v1

    move-object v8, v0

    move-object v0, v1

    goto :goto_5

    :catch_2
    move-exception v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_4

    :catch_3
    move-exception v1

    move-object v1, v0

    move-object v0, v2

    goto :goto_4

    :catch_4
    move-exception v4

    goto :goto_3

    :catch_5
    move-exception v4

    goto/16 :goto_2
.end method

.method b(Lnet/youmi/android/a/a/g/d/a/d;)Z
    .locals 14

    const-wide/16 v12, 0x0

    const/4 v1, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/a/g/d/a/d;->a()Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const-string v3, "lock"

    monitor-enter v3

    const/4 v2, 0x0

    :try_start_0
    sget-object v4, Lnet/youmi/android/a/a/g/d/a/b;->b:Lnet/youmi/android/a/a/g/d/a/c;

    invoke-virtual {v4}, Lnet/youmi/android/a/a/g/d/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v2

    :try_start_1
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/database/sqlite/SQLiteDatabase;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v4

    if-nez v4, :cond_2

    :try_start_2
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

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
    iget-wide v4, p1, Lnet/youmi/android/a/a/g/d/a/d;->e:J
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    cmp-long v4, v4, v12

    if-gtz v4, :cond_3

    :try_start_4
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :cond_3
    :try_start_5
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    const-string v4, "e"

    iget-wide v8, p1, Lnet/youmi/android/a/a/g/d/a/d;->e:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v6, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v4, p1, Lnet/youmi/android/a/a/g/d/a/d;->b:Ljava/lang/String;

    const-string v5, "lock"

    invoke-static {v4, v5}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result-object v7

    const-wide/16 v4, -0x1

    :try_start_6
    const-string v8, "Exj23LdkF"

    const-string v9, "b=?"

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/String;

    const/4 v11, 0x0

    aput-object v7, v10, v11

    invoke-virtual {v2, v8, v6, v9, v10}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-result v4

    int-to-long v4, v4

    :goto_1
    cmp-long v4, v12, v4

    if-eqz v4, :cond_4

    :try_start_7
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v3

    move v0, v1

    goto :goto_0

    :cond_4
    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v3

    goto :goto_0

    :catch_0
    move-exception v1

    move-object v1, v2

    :goto_2
    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    monitor-exit v3

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-direct {p0, v2}, Lnet/youmi/android/a/a/g/d/a/b;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catch_1
    move-exception v1

    move-object v1, v2

    goto :goto_2

    :catch_2
    move-exception v6

    goto :goto_1
.end method
