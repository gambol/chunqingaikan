package com.tencent.open.a; class b { void a() { int a;
a=0;// .class public Lcom/tencent/open/a/b;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/open/a/b$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;// .field private c:Lcom/tencent/open/a/b$a;
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 76
a=0;//     #p0=(Reference,Lcom/tencent/open/a/b;);
a=0;//     iput-object p1, p0, Lcom/tencent/open/a/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v0, Lcom/tencent/open/a/b$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/a/b$a;);
a=0;//     const-string v3, "sdk_cgi_report.db"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/a/b;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/open/a/b$a;-><init>(Lcom/tencent/open/a/b;Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/a/b$a;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/a/b;->c:Lcom/tencent/open/a/b$a;
a=0;// 
a=0;//     .line 80
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/a/b;->c()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/tencent/open/a/b;->d:I
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public declared-synchronized a(Ljava/util/ArrayList;)I
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/tencent/open/a/d;",
a=0;//             ">;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "ReportDataModal backupOldItems count = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 141
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 142
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     .line 143
a=0;//     new-instance v3, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 144
a=0;//     #v3=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v4, "apn"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 145
a=0;//     const-string v4, "frequency"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 146
a=0;//     const-string v4, "commandid"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 147
a=0;//     const-string v4, "resultcode"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 148
a=0;//     const-string v4, "tmcost"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 149
a=0;//     const-string v4, "reqsize"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 150
a=0;//     const-string v4, "rspsize"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 151
a=0;//     const-string v4, "deviceinfo"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 152
a=0;//     const-string v4, "detail"
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 154
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/b;->c:Lcom/tencent/open/a/b$a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/b$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v4, "olddata"
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v0, v4, v5, v3}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     .line 156
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 160
a=0;//     :goto_1
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 161
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 157
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 158
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 140
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 162
a=0;//     :cond_0
a=0;//     :try_start_3
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Reference,Ljava/util/Iterator;);
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "ReportDataModal backupOldItems succ_count = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 163
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized a()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 173
a=0;//     #v0=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v1, "cgi_report_debug"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "ReportDataModal deleteOldItems start"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 175
a=0;//     :try_start_1
a=0;//     iget-object v1, p0, Lcom/tencent/open/a/b;->c:Lcom/tencent/open/a/b$a;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/open/a/b$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 182
a=0;//     :try_start_2
a=0;//     const-string v1, "delete from olddata;"
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 184
a=0;//     :try_start_3
a=0;//     iget-object v2, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 191
a=0;//     :try_start_4
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;// 
a=0;//     .line 192
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     const-string v1, "ReportDataModal deleteOldItems success"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 193
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 176
a=0;//     :catch_0
a=0;//     #v0=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 177
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 173
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 185
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/String;);v2=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 186
a=0;//     :try_start_6
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v1, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJJLjava/lang/String;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v2, "?"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     const-string v2, "\\?"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 95
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object p3, v2, v3
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "cgi_report_debug"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "ReportDataModal addNewItem apn="
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
a=0;//     const-string v4, ",frequency="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ",commandid="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ",resultCode="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ",costTime="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p5, p6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ",reqSzie="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p7, p8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ",rspSize="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-wide/from16 v0, p9
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v3, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 104
a=0;//     #v3=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v2, "apn"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 105
a=0;//     const-string v2, "frequency"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 106
a=0;//     const-string v2, "commandid"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 107
a=0;//     const-string v2, "resultcode"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 108
a=0;//     const-string v2, "tmcost"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p5, p6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 109
a=0;//     const-string v2, "reqsize"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p7, p8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 110
a=0;//     const-string v2, "rspsize"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-wide/from16 v0, p9
a=0;// 
a=0;//     invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 111
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 112
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "network="
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/16 v5, 0x26
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 113
a=0;//     const-string v2, "sdcard="
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v6, "mounted"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v5, 0x26
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 114
a=0;//     const-string v2, "wifi="
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v5, p0, Lcom/tencent/open/a/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v5}, Lcom/tencent/open/a/a;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 116
a=0;//     const-string v4, "deviceinfo"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 117
a=0;//     const-string v2, "detail"
a=0;// 
a=0;//     move-object/from16 v0, p11
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 119
a=0;//     :try_start_1
a=0;//     iget-object v2, p0, Lcom/tencent/open/a/b;->c:Lcom/tencent/open/a/b$a;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/open/a/b$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v2, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v4, "newdata"
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v4, v5, v3}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v2, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;// 
a=0;//     .line 122
a=0;//     const-string v2, "cgi_report_debug"
a=0;// 
a=0;//     const-string v3, "ReportDataModal addNewItem success"
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 128
a=0;//     :try_start_2
a=0;//     iget v2, p0, Lcom/tencent/open/a/b;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     iput v2, p0, Lcom/tencent/open/a/b;->d:I
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 129
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);v5=(Reference,Ljava/lang/String;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v2
a=0;// 
a=0;//     .line 113
a=0;//     :cond_1
a=0;//     #v0=(LongLo);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 123
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 124
a=0;//     :try_start_3
a=0;//     const-string v3, "cgi_report_debug"
a=0;// 
a=0;//     const-string v4, "ReportDataModal addNewItem failed"
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 125
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 126
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 93
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized b()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 203
a=0;//     #v0=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v1, "cgi_report_debug"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "ReportDataModal deleteNewItems start"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 205
a=0;//     :try_start_1
a=0;//     iget-object v1, p0, Lcom/tencent/open/a/b;->c:Lcom/tencent/open/a/b$a;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/open/a/b$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 212
a=0;//     :try_start_2
a=0;//     const-string v1, "delete from newdata;"
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 214
a=0;//     :try_start_3
a=0;//     iget-object v2, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 221
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_4
a=0;//     iput v0, p0, Lcom/tencent/open/a/b;->d:I
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;// 
a=0;//     .line 223
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     const-string v1, "ReportDataModal deleteNewItems start"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 224
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 206
a=0;//     :catch_0
a=0;//     #v0=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 207
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 203
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 215
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/String;);v2=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 216
a=0;//     :try_start_6
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v1, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized c()Ljava/util/ArrayList;
a=0;//     .locals 12
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/tencent/open/a/d;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ReportDataModal getNewItems start"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 230
a=0;//     new-instance v10, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 232
a=0;//     :try_start_1
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/b;->c:Lcom/tencent/open/a/b$a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/b$a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 238
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v1, "select * from newdata"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 239
a=0;//     #v11=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     .line 240
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->isAfterLast()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 241
a=0;//     const-string v0, "apn"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 242
a=0;//     const-string v0, "frequency"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 243
a=0;//     const-string v0, "commandid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 244
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "resultcode"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 245
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "tmcost"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 246
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "reqsize"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 247
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "rspsize"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 248
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "detail"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 249
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "deviceinfo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 251
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/a/d;);
a=0;//     invoke-direct/range {v0 .. v9}, Lcom/tencent/open/a/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 253
a=0;//     #v0=(Reference,Lcom/tencent/open/a/d;);
a=0;//     invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 254
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 229
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 233
a=0;//     :catch_0
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Reference,Ljava/util/ArrayList;);v11=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 234
a=0;//     :try_start_3
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     move-object v0, v10
a=0;// 
a=0;//     .line 260
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 256
a=0;//     :cond_0
a=0;//     :try_start_4
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/Object;);v11=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 258
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;// 
a=0;//     .line 259
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "ReportDataModal getNewItems success, count = "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     move-object v0, v10
a=0;// 
a=0;//     .line 260
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized d()Ljava/util/ArrayList;
a=0;//     .locals 12
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/tencent/open/a/d;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ReportDataModal getOldItems start"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 266
a=0;//     new-instance v10, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 268
a=0;//     :try_start_1
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/b;->c:Lcom/tencent/open/a/b$a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/b$a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 274
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v1, "select * from olddata"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 275
a=0;//     #v11=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     .line 276
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->isAfterLast()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 277
a=0;//     const-string v0, "apn"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 278
a=0;//     const-string v0, "frequency"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 279
a=0;//     const-string v0, "commandid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 280
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "resultcode"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 281
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "tmcost"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 282
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "reqsize"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 283
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "rspsize"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 284
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "detail"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 285
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "deviceinfo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 287
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/a/d;);
a=0;//     invoke-direct/range {v0 .. v9}, Lcom/tencent/open/a/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 289
a=0;//     #v0=(Reference,Lcom/tencent/open/a/d;);
a=0;//     invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 290
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 265
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 269
a=0;//     :catch_0
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Reference,Ljava/util/ArrayList;);v11=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 270
a=0;//     :try_start_3
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     move-object v0, v10
a=0;// 
a=0;//     .line 296
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 292
a=0;//     :cond_0
a=0;//     :try_start_4
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/Object;);v11=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v11}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 294
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/b;->b:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
a=0;// 
a=0;//     .line 295
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "ReportDataModal getOldItems success, count = "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     move-object v0, v10
a=0;// 
a=0;//     .line 296
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public e()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 300
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "ReportDataModal getTotalCount count = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/open/a/b;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 301
a=0;//     iget v0, p0, Lcom/tencent/open/a/b;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
