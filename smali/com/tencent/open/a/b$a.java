package com.tencent.open.a; class b$a { void a() { int a;
a=0;// .class Lcom/tencent/open/a/b$a;
a=0;// .super Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/open/a/b;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "a"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/open/a/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/open/a/b;Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iput-object p1, p0, Lcom/tencent/open/a/b$a;->a:Lcom/tencent/open/a/b;
a=0;// 
a=0;//     .line 38
a=0;//     invoke-direct {p0, p2, p3, p4, p5}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/tencent/open/a/b$a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     :try_start_0
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ReportDataModal onCreate sql1 = create table if not exists newdata(id integer primary key,apn text,frequency text,commandid text,resultcode text,tmcost text,reqsize text,rspsize text,deviceinfo text,detail text)"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 45
a=0;//     const-string v0, "create table if not exists newdata(id integer primary key,apn text,frequency text,commandid text,resultcode text,tmcost text,reqsize text,rspsize text,deviceinfo text,detail text)"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 46
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     const-string v1, "ReportDataModal onCreate sql2 = create table if not exists olddata(id integer primary key,apn text,frequency text,commandid text,resultcode text,tmcost text,reqsize text,rspsize text,deviceinfo text,detail text)"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 47
a=0;//     const-string v0, "create table if not exists olddata(id integer primary key,apn text,frequency text,commandid text,resultcode text,tmcost text,reqsize text,rspsize text,deviceinfo text,detail text)"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 52
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 48
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 49
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "cgi_report_debug"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "ReportDataModal onCreate failed"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "ReportDataModal onUpgrade oldVersion="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "  newVersion="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 58
a=0;//     if-eq p2, p3, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     :try_start_0
a=0;//     const-string v0, "drop table if exists newdata"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     const-string v0, "drop table if exists olddata"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 62
a=0;//     invoke-virtual {p0, p1}, Lcom/tencent/open/a/b$a;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;// 
a=0;//     .line 63
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     const-string v1, "ReportDataModal onUpgrade success"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 64
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 65
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     const-string v1, "ReportDataModal onUpgrade failed"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
