package com.tencent.stat; class t { void a() { int a;
a=0;// .class Lcom/tencent/stat/t;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/stat/n;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/stat/n;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/stat/t;->a:Lcom/tencent/stat/n;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/t;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v8=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/t;->a:Lcom/tencent/stat/n;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/n;);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/n;->b(Lcom/tencent/stat/n;)Lcom/tencent/stat/w;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "config"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
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
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Integer);v5=(Reference,Lcom/tencent/stat/b;);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-interface {v1, v4}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     new-instance v5, Lcom/tencent/stat/b;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/stat/b;);
a=0;//     invoke-direct {v5, v0}, Lcom/tencent/stat/b;-><init>(I)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/stat/b;);
a=0;//     iput v0, v5, Lcom/tencent/stat/b;->a:I
a=0;// 
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     iput-object v0, v5, Lcom/tencent/stat/b;->b:Lorg/json/JSONObject;
a=0;// 
a=0;//     iput-object v3, v5, Lcom/tencent/stat/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput v4, v5, Lcom/tencent/stat/b;->d:I
a=0;// 
a=0;//     invoke-static {v5}, Lcom/tencent/stat/StatConfig;->a(Lcom/tencent/stat/b;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/stat/n;->d()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Integer);v5=(Reference,Lcom/tencent/stat/b;);v6=(Null);v7=(Null);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v8
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v8
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
