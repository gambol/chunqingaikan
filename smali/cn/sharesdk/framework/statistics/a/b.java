package cn.sharesdk.framework.statistics.a; class b { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/statistics/a/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static c:Lcn/sharesdk/framework/statistics/a/b;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Lcn/sharesdk/framework/statistics/a/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/a/b;->c:Lcn/sharesdk/framework/statistics/a/b;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/statistics/a/b;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/statistics/a/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/statistics/a/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/statistics/a/a;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/a/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcn/sharesdk/framework/statistics/a/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a/a;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/statistics/a/b;->b:Lcn/sharesdk/framework/statistics/a/a;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a/b;
a=0;//     .locals 2
a=0;// 
a=0;//     const-class v1, Lcn/sharesdk/framework/statistics/a/b;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcn/sharesdk/framework/statistics/a/b;->c:Lcn/sharesdk/framework/statistics/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a/b;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/statistics/a/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/statistics/a/b;);
a=0;//     invoke-direct {v0, p0}, Lcn/sharesdk/framework/statistics/a/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a/b;);
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/a/b;->c:Lcn/sharesdk/framework/statistics/a/b;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcn/sharesdk/framework/statistics/a/b;->c:Lcn/sharesdk/framework/statistics/a/b;
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
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;)I
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/a/b;->b:Lcn/sharesdk/framework/statistics/a/a;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/statistics/a/a;);
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/statistics/a/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "select count(*) from "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Boolean);
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     move-exception v1
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a/b;->b:Lcn/sharesdk/framework/statistics/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a/a;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/statistics/a/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Integer);
a=0;//     const-string v1, "Deleted %d rows from table: %s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aput-object p1, v3, v4
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v3, "when delete database occur error table:%s,"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p1, v4, v2
a=0;// 
a=0;//     invoke-static {v1, v3, v4}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;//     .locals 6
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a/b;->b:Lcn/sharesdk/framework/statistics/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a/a;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/statistics/a/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, p1, v3, p2}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v3=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     const-string v3, "when insert database occur error table:%s,"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object p1, v4, v5
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     .locals 9
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a/b;->b:Lcn/sharesdk/framework/statistics/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a/a;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/statistics/a/a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "Query table: %s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object p1, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v2, p2
a=0;// 
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     move-object v7, p5
a=0;// 
a=0;//     :try_start_0
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v1, "when query database occur error table:%s,"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object p1, v2, v3
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     move-object v0, v8
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
