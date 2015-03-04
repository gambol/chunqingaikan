package com.twocloo.com.cn.http; class Down { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/http/Down;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Down.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/http/Down$DownThread;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public bookd:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;// .field public bookname:Ljava/lang/String;
a=0;// 
a=0;// .field dsize:J
a=0;// 
a=0;// .field eachThreadbeg:[J
a=0;// 
a=0;// .field eachThreadend:[J
a=0;// 
a=0;// .field eachThreadstart:[J
a=0;// 
a=0;// .field private filelocation:Ljava/lang/String;
a=0;// 
a=0;// .field private filename:Ljava/lang/String;
a=0;// 
a=0;// .field private flag:Z
a=0;// 
a=0;// .field private fsize:J
a=0;// 
a=0;// .field private isstop:Z
a=0;// 
a=0;// .field m:J
a=0;// 
a=0;// .field private ptime:J
a=0;// 
a=0;// .field private time:Ljava/lang/String;
a=0;// 
a=0;// .field private tnum:I
a=0;// 
a=0;// .field private url:Ljava/net/URL;
a=0;// 
a=0;// .field private urllocation:Ljava/lang/String;
a=0;// 
a=0;// .field private v:Ljava/util/Vector;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/http/Down$DownThread;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 60
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 21
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/Down;);
a=0;//     iput-wide v1, p0, Lcom/twocloo/com/cn/http/Down;->ptime:J
a=0;// 
a=0;//     .line 40
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/http/Down;->flag:Z
a=0;// 
a=0;//     .line 42
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/http/Down;->isstop:Z
a=0;// 
a=0;//     .line 48
a=0;//     iput-wide v1, p0, Lcom/twocloo/com/cn/http/Down;->m:J
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v0}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/Down;->v:Ljava/util/Vector;
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/net/URL;ILcom/twocloo/com/cn/beans/BFBook;)V
a=0;//     .locals 6
a=0;//     .param p1, "url"    # Ljava/net/URL;
a=0;//     .param p2, "tnum"    # I
a=0;//     .param p3, "bookd1"    # Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 64
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 21
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/Down;);
a=0;//     iput-wide v4, p0, Lcom/twocloo/com/cn/http/Down;->ptime:J
a=0;// 
a=0;//     .line 40
a=0;//     iput-boolean v3, p0, Lcom/twocloo/com/cn/http/Down;->flag:Z
a=0;// 
a=0;//     .line 42
a=0;//     iput-boolean v3, p0, Lcom/twocloo/com/cn/http/Down;->isstop:Z
a=0;// 
a=0;//     .line 48
a=0;//     iput-wide v4, p0, Lcom/twocloo/com/cn/http/Down;->m:J
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v3, Ljava/util/Vector;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v3}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Vector;);
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/http/Down;->v:Ljava/util/Vector;
a=0;// 
a=0;//     .line 65
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/Down;->url:Ljava/net/URL;
a=0;// 
a=0;//     .line 66
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/http/Down;->tnum:I
a=0;// 
a=0;//     .line 67
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/http/Down;->bookd:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 68
a=0;//     invoke-virtual {p3}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/http/Down;->bookname:Ljava/lang/String;
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "book_text_"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ".txt"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/http/Down;->filename:Ljava/lang/String;
a=0;// 
a=0;//     .line 70
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_BOOK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-char v4, Ljava/io/File;->separatorChar:C
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-char v4, Ljava/io/File;->separatorChar:C
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/Down;->filename:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/http/Down;->filelocation:Ljava/lang/String;
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/Down;->filelocation:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 72
a=0;//     .local v2, "f":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 78
a=0;//     invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/http/Down;->urllocation:Ljava/lang/String;
a=0;// 
a=0;//     .line 79
a=0;//     invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 80
a=0;//     .local v0, "conn":Ljava/net/URLConnection;
a=0;//     #v0=(Reference,Ljava/net/URLConnection;);
a=0;//     invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iput-wide v3, p0, Lcom/twocloo/com/cn/http/Down;->fsize:J
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\u6587\u4ef6\u957f\u5ea6   ------   "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-wide v4, p0, Lcom/twocloo/com/cn/http/Down;->fsize:J
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 87
a=0;//     .end local v0    # "conn":Ljava/net/URLConnection;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 83
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 84
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/http/Down;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/Down;->urllocation:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/http/Down;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/Down;->filelocation:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/http/Down;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/http/Down;->isstop:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private startT(Lcom/twocloo/com/cn/http/Down$DownThread;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Lcom/twocloo/com/cn/http/Down$DownThread;
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public Isstop()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 302
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/http/Down;->isstop:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public downsize()J
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v9, 0x0
a=0;// 
a=0;//     .line 176
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     iget-boolean v4, p0, Lcom/twocloo/com/cn/http/Down;->isstop:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     iget-boolean v4, p0, Lcom/twocloo/com/cn/http/Down;->flag:Z
a=0;// 
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 177
a=0;//     iput-wide v9, p0, Lcom/twocloo/com/cn/http/Down;->dsize:J
a=0;// 
a=0;//     .line 178
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 179
a=0;//     .local v0, "buff":Ljava/lang/StringBuffer;
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/http/Down;->v:Ljava/util/Vector;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v4}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 187
a=0;//     :try_start_0
a=0;//     new-instance v3, Ljava/io/PrintWriter;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/http/Down;->filelocation:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, ".tmp"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/io/PrintWriter;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 188
a=0;//     .local v3, "w":Ljava/io/PrintWriter;
a=0;//     #v3=(Reference,Ljava/io/PrintWriter;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 189
a=0;//     invoke-virtual {v3}, Ljava/io/PrintWriter;->flush()V
a=0;// 
a=0;//     .line 190
a=0;//     invoke-virtual {v3}, Ljava/io/PrintWriter;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 196
a=0;//     .end local v0    # "buff":Ljava/lang/StringBuffer;
a=0;//     .end local v3    # "w":Ljava/io/PrintWriter;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-wide v4, p0, Lcom/twocloo/com/cn/http/Down;->dsize:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iget-wide v6, p0, Lcom/twocloo/com/cn/http/Down;->fsize:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v4, v4, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 197
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iput-boolean v4, p0, Lcom/twocloo/com/cn/http/Down;->flag:Z
a=0;// 
a=0;//     .line 199
a=0;//     :cond_1
a=0;//     #v4=(Byte);
a=0;//     iget-wide v4, p0, Lcom/twocloo/com/cn/http/Down;->dsize:J
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     return-wide v4
a=0;// 
a=0;//     .line 179
a=0;//     .restart local v0    # "buff":Ljava/lang/StringBuffer;
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);v2=(Uninit);v3=(Uninit);v4=(Reference,Ljava/util/Iterator;);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/http/Down$DownThread;
a=0;// 
a=0;//     .line 180
a=0;//     .local v1, "d":Lcom/twocloo/com/cn/http/Down$DownThread;
a=0;//     iget-wide v5, v1, Lcom/twocloo/com/cn/http/Down$DownThread;->x:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v5, v5, v9
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 181
a=0;//     iget-wide v5, v1, Lcom/twocloo/com/cn/http/Down$DownThread;->start:J
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     iput-wide v5, v1, Lcom/twocloo/com/cn/http/Down$DownThread;->x:J
a=0;// 
a=0;//     .line 182
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-wide v6, v1, Lcom/twocloo/com/cn/http/Down$DownThread;->x:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, ":"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-wide v6, v1, Lcom/twocloo/com/cn/http/Down$DownThread;->end:J
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, " "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 183
a=0;//     iget-wide v5, p0, Lcom/twocloo/com/cn/http/Down;->dsize:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iget-wide v7, v1, Lcom/twocloo/com/cn/http/Down$DownThread;->size:J
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     add-long/2addr v5, v7
a=0;// 
a=0;//     iput-wide v5, p0, Lcom/twocloo/com/cn/http/Down;->dsize:J
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 191
a=0;//     .end local v1    # "d":Lcom/twocloo/com/cn/http/Down$DownThread;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 192
a=0;//     .local v2, "e":Ljava/io/FileNotFoundException;
a=0;//     #v2=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     invoke-virtual {v2}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v2}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public finish()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/Down;->filelocation:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, ".tmp"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 208
a=0;//     .local v0, "f":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 212
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getFilelocation()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 278
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/Down;->filelocation:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFilename()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/Down;->filename:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFsize()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     iget-wide v0, p0, Lcom/twocloo/com/cn/http/Down;->fsize:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getPtime()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 322
a=0;//     iget-wide v0, p0, Lcom/twocloo/com/cn/http/Down;->ptime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getTime()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/Down;->time:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getUrllocation()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 235
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/Down;->urllocation:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isFlag()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/http/Down;->flag:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setDsize(J)V
a=0;//     .locals 0
a=0;//     .param p1, "dsize"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     iput-wide p1, p0, Lcom/twocloo/com/cn/http/Down;->dsize:J
a=0;// 
a=0;//     .line 319
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setEachThread([[J)V
a=0;//     .locals 2
a=0;//     .param p1, "a"    # [[J
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 293
a=0;//     #v1=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 294
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v0, p1, v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/Down;->eachThreadbeg:[J
a=0;// 
a=0;//     .line 295
a=0;//     aget-object v0, p1, v1
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/Down;->eachThreadend:[J
a=0;// 
a=0;//     .line 296
a=0;//     aget-object v0, p1, v1
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/http/Down;->tnum:I
a=0;// 
a=0;//     .line 299
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFilelocation(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "filelocation"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/Down;->filelocation:Ljava/lang/String;
a=0;// 
a=0;//     .line 220
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFilename(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "filename"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/Down;->filename:Ljava/lang/String;
a=0;// 
a=0;//     .line 267
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFlag(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "flag"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 310
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/http/Down;->flag:Z
a=0;// 
a=0;//     .line 311
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFsize(J)V
a=0;//     .locals 0
a=0;//     .param p1, "fsize"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     iput-wide p1, p0, Lcom/twocloo/com/cn/http/Down;->fsize:J
a=0;// 
a=0;//     .line 271
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIsstop(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "isstop"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 314
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/http/Down;->isstop:Z
a=0;// 
a=0;//     .line 315
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPtime(J)V
a=0;//     .locals 0
a=0;//     .param p1, "ptime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 326
a=0;//     iput-wide p1, p0, Lcom/twocloo/com/cn/http/Down;->ptime:J
a=0;// 
a=0;//     .line 327
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTime(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "time"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/Down;->time:Ljava/lang/String;
a=0;// 
a=0;//     .line 224
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setUrllocation(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "urllocation"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/Down;->urllocation:Ljava/lang/String;
a=0;// 
a=0;//     .line 275
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public start()V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     iget-wide v1, p0, Lcom/twocloo/com/cn/http/Down;->fsize:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/http/Down;->tnum:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     div-long v9, v1, v3
a=0;// 
a=0;//     .line 156
a=0;//     .local v9, "tsize":J
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/http/Down;->tnum:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v1, v1, [J
a=0;// 
a=0;//     #v1=(Reference,[J);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/http/Down;->eachThreadstart:[J
a=0;// 
a=0;//     .line 157
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/http/Down;->tnum:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v1, v1, [J
a=0;// 
a=0;//     #v1=(Reference,[J);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/http/Down;->eachThreadend:[J
a=0;// 
a=0;//     .line 158
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .local v8, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v8=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/http/Down;->tnum:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v8, v1, :cond_1
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/Down;->eachThreadbeg:[J
a=0;// 
a=0;//     #v1=(Reference,[J);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/Down;->eachThreadstart:[J
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/http/Down;->eachThreadbeg:[J
a=0;// 
a=0;//     .line 168
a=0;//     :cond_0
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/http/Down;->tnum:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v8, v1, :cond_3
a=0;// 
a=0;//     .line 173
a=0;//     return-void
a=0;// 
a=0;//     .line 159
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v4=(LongHi);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/Down;->eachThreadstart:[J
a=0;// 
a=0;//     #v1=(Reference,[J);
a=0;//     int-to-long v2, v8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-long/2addr v2, v9
a=0;// 
a=0;//     aput-wide v2, v1, v8
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/Down;->eachThreadend:[J
a=0;// 
a=0;//     int-to-long v2, v8
a=0;// 
a=0;//     mul-long/2addr v2, v9
a=0;// 
a=0;//     add-long/2addr v2, v9
a=0;// 
a=0;//     aput-wide v2, v1, v8
a=0;// 
a=0;//     .line 161
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/http/Down;->tnum:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     if-ne v8, v1, :cond_2
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/Down;->eachThreadend:[J
a=0;// 
a=0;//     #v1=(Reference,[J);
a=0;//     iget-wide v2, p0, Lcom/twocloo/com/cn/http/Down;->fsize:J
a=0;// 
a=0;//     aput-wide v2, v1, v8
a=0;// 
a=0;//     .line 158
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 169
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/http/Down$DownThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/http/Down$DownThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/Down;->eachThreadstart:[J
a=0;// 
a=0;//     #v1=(Reference,[J);
a=0;//     aget-wide v2, v1, v8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/Down;->eachThreadbeg:[J
a=0;// 
a=0;//     aget-wide v4, v1, v8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/Down;->eachThreadend:[J
a=0;// 
a=0;//     aget-wide v6, v1, v8
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/twocloo/com/cn/http/Down$DownThread;-><init>(Lcom/twocloo/com/cn/http/Down;JJJ)V
a=0;// 
a=0;//     .line 170
a=0;//     .local v0, "dthread":Lcom/twocloo/com/cn/http/Down$DownThread;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/Down$DownThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/Down;->v:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 171
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/http/Down;->startT(Lcom/twocloo/com/cn/http/Down$DownThread;)V
a=0;// 
a=0;//     .line 168
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public stop()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/http/Down;->isstop:Z
a=0;// 
a=0;//     .line 204
a=0;//     return-void
a=0;// .end method
}}
