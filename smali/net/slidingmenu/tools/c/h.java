package net.slidingmenu.tools.c; class h { void a() { int a;
a=0;// .class Lnet/slidingmenu/tools/c/h;
a=0;// .super Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String;
a=0;// 
a=0;// .field private static b:Lnet/slidingmenu/tools/c/h;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 5
a=0;// 
a=0;//     sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     const-string v1, "create table %s (%s integer primary key autoincrement, %s integer, %s varchar(128), %s BIGINT,  unique(%s,%s)) "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "_id"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const-string v4, "a"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     const-string v4, "b"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     const-string v4, "c"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     const-string v4, "a"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     const-string v4, "b"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/c/h;->a:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/c/h;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/c/h;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/database/Cursor;)Ljava/util/List;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p0}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     new-instance v2, Lnet/slidingmenu/tools/c/i;
a=0;// 
a=0;//     #v2=(UninitRef,Lnet/slidingmenu/tools/c/i;);
a=0;//     invoke-direct {v2}, Lnet/slidingmenu/tools/c/i;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/c/i;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {p0, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lnet/slidingmenu/tools/c/i;->a(I)V
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-interface {p0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lnet/slidingmenu/tools/c/i;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-interface {p0, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lnet/slidingmenu/tools/c/i;->b(I)V
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-interface {p0, v3}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2, v3, v4}, Lnet/slidingmenu/tools/c/i;->a(J)V
a=0;// 
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static declared-synchronized a(Landroid/content/Context;)Lnet/slidingmenu/tools/c/h;
a=0;//     .locals 3
a=0;// 
a=0;//     const-class v1, Lnet/slidingmenu/tools/c/h;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/c/h;->b:Lnet/slidingmenu/tools/c/h;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/c/h;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/c/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/c/h;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Lnet/slidingmenu/tools/c/h;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/c/h;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/c/h;->b:Lnet/slidingmenu/tools/c/h;
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/c/h;->b:Lnet/slidingmenu/tools/c/h;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "and"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "roid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "db"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/c/a/b;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "2"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/c/a/b;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(ILjava/lang/String;)Lnet/slidingmenu/tools/c/i;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/c/h;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     move-object v1, v8
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/c/i;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-object v1, v8
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);
a=0;//     const-string v1, "a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "_id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "b"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const-string v4, "a"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     const-string v4, "c"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const-string v3, "b=? and a=?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object p2, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/c/h;->a(Landroid/database/Cursor;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lnet/slidingmenu/tools/c/i;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_9
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     :try_start_5
a=0;//     monitor-exit p0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Landroid/database/Cursor;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Reference,Ljava/util/List;);v2=(Reference,Landroid/database/Cursor;);v4=(Reference,[Ljava/lang/String;);v5=(Null);v6=(Null);v7=(Null);v8=(Null);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_4
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_5
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_4
a=0;//     :try_start_8
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     monitor-exit p0
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     move-object v1, v8
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v8
a=0;// 
a=0;//     :goto_5
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_6
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_0
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_6
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     :try_start_a
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_1
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :goto_7
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);v8=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v8, :cond_8
a=0;// 
a=0;//     :try_start_b
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_7
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_0
a=0;// 
a=0;//     :cond_8
a=0;//     :goto_8
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     :try_start_c
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_8
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_0
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_9
a=0;//     :try_start_d
a=0;//     throw v1
a=0;//     :try_end_d
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v2=(Reference,Landroid/database/Cursor;);v3=(Null);v4=(Reference,[Ljava/lang/String;);v5=(Null);v6=(Null);v7=(Null);v8=(Null);
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_4
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_5
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_6
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_7
a=0;//     #v8=(Reference,Landroid/database/Cursor;);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catch_8
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     :catchall_2
a=0;//     #v2=(Reference,Landroid/database/Cursor;);v3=(Reference,Ljava/lang/String;);v4=(Reference,[Ljava/lang/String;);v5=(Null);v6=(Null);v7=(Null);v8=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v8, v2
a=0;// 
a=0;//     #v8=(Reference,Landroid/database/Cursor;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_9
a=0;//     #v8=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/util/List;)Z
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/c/h;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v3, v0, :cond_8
a=0;// 
a=0;//     invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lnet/slidingmenu/tools/c/i;
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     :goto_2
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/c/i;);
a=0;//     new-instance v5, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v6, "b"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/c/i;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "c"
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/c/i;->c()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     const-string v6, "a"
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/c/i;->d()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/c/i;->a()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_6
a=0;// 
a=0;//     const-string v6, "a"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "_id=?"
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     new-array v8, v8, [Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/c/i;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, ""
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     invoke-virtual {v4, v6, v5, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v2, "test"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     :try_start_4
a=0;//     monitor-exit p0
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/c/i;);v2=(One);v3=(Integer);v5=(Reference,Landroid/content/ContentValues;);v6=(Integer);v7=(Reference,Ljava/lang/Integer;);v8=(LongHi);
a=0;//     const-string v0, "a"
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v4, v0, v6, v5}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_4
a=0;//     :try_start_7
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_8
a=0;//     :try_start_8
a=0;//     #v0=(Integer);v1=(Null);v2=(One);v3=(Integer);v4=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_0
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     if-eqz v4, :cond_9
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_3
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_1
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_5
a=0;//     :try_start_a
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit p0
a=0;//     :try_end_a
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_1
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Null);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Integer);v2=(One);v3=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method public a(Lnet/slidingmenu/tools/c/i;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lnet/slidingmenu/tools/c/h;->a(Ljava/util/List;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/c/h;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, " drop table if exists a"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/c/h;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
