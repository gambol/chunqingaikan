package com.twocloo.com.cn.http; class Down$DownThread { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/http/Down$DownThread;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Down.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/http/Down;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "DownThread"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field begin:J
a=0;// 
a=0;// .field end:J
a=0;// 
a=0;// .field size:J
a=0;// 
a=0;// .field start:J
a=0;// 
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/http/Down;
a=0;// 
a=0;// .field private u:Ljava/net/URL;
a=0;// 
a=0;// .field x:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/twocloo/com/cn/http/Down;JJJ)V
a=0;//     .locals 3
a=0;//     .param p2, "start"    # J
a=0;//     .param p4, "begin"    # J
a=0;//     .param p6, "end"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->this$0:Lcom/twocloo/com/cn/http/Down;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 103
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/Down$DownThread;);
a=0;//     iput-wide p2, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->start:J
a=0;// 
a=0;//     .line 104
a=0;//     iput-wide p4, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->begin:J
a=0;// 
a=0;//     .line 105
a=0;//     iput-wide p6, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->end:J
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u542f\u52a8\u4e0b\u8f7d   end\uff1a"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p6, p7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 108
a=0;//     :try_start_0
a=0;//     new-instance v1, Ljava/net/URL;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-static {p1}, Lcom/twocloo/com/cn/http/Down;->access$0(Lcom/twocloo/com/cn/http/Down;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/URL;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->u:Ljava/net/URL;
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 112
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 109
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 110
a=0;//     .local v0, "e":Ljava/net/MalformedURLException;
a=0;//     #v0=(Reference,Ljava/net/MalformedURLException;);
a=0;//     invoke-virtual {v0}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     const-string v7, "\u542f\u52a8\u4e0b\u8f7d2"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 116
a=0;//     const/16 v7, 0x400
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     new-array v0, v7, [B
a=0;// 
a=0;//     .line 117
a=0;//     .local v0, "bt":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 118
a=0;//     .local v4, "l":I
a=0;//     #v4=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 119
a=0;//     .local v3, "in":Ljava/io/InputStream;
a=0;//     #v3=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 120
a=0;//     .local v5, "r":Ljava/io/RandomAccessFile;
a=0;//     #v5=(Null);
a=0;//     iget-wide v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->begin:J
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     iget-wide v9, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->start:J
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     sub-long/2addr v7, v9
a=0;// 
a=0;//     iput-wide v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->size:J
a=0;// 
a=0;//     .line 121
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-wide v8, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->begin:J
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "   \u5f00\u59cb\u4e0b\u8f7d       "
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-wide v8, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->end:J
a=0;// 
a=0;//     #v8=(LongLo);
a=0;//     invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 122
a=0;//     iget-wide v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->begin:J
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     iget-wide v9, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->end:J
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     cmp-long v7, v7, v9
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-gez v7, :cond_2
a=0;// 
a=0;//     .line 124
a=0;//     :try_start_0
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->u:Ljava/net/URL;
a=0;// 
a=0;//     #v7=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v2, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 125
a=0;//     .local v2, "hcon":Ljava/net/HttpURLConnection;
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v2, v7}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 126
a=0;//     const-string v7, "RANGE"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "bytes="
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-wide v9, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->begin:J
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "-"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v2, v7, v8}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 127
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 128
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v6, Ljava/io/RandomAccessFile;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/RandomAccessFile;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->this$0:Lcom/twocloo/com/cn/http/Down;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/http/Down;->access$1(Lcom/twocloo/com/cn/http/Down;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "rw"
a=0;// 
a=0;//     invoke-direct {v6, v7, v8}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 129
a=0;//     .end local v5    # "r":Ljava/io/RandomAccessFile;
a=0;//     .local v6, "r":Ljava/io/RandomAccessFile;
a=0;//     :try_start_1
a=0;//     #v6=(Reference,Ljava/io/RandomAccessFile;);
a=0;//     iget-wide v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->begin:J
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {v6, v7, v8}, Ljava/io/RandomAccessFile;->seek(J)V
a=0;// 
a=0;//     .line 130
a=0;//     iget-wide v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->begin:J
a=0;// 
a=0;//     iput-wide v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->x:J
a=0;// 
a=0;//     .line 131
a=0;//     :goto_0
a=0;//     #v4=(Integer);v9=(Conflicted);
a=0;//     invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     iget-wide v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->x:J
a=0;// 
a=0;//     iget-wide v9, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->end:J
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     cmp-long v7, v7, v9
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-gez v7, :cond_0
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->this$0:Lcom/twocloo/com/cn/http/Down;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/http/Down;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/http/Down;->access$2(Lcom/twocloo/com/cn/http/Down;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v6}, Ljava/io/RandomAccessFile;->close()V
a=0;// 
a=0;//     .line 139
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 141
a=0;//     :cond_1
a=0;//     invoke-static {}, Ljava/lang/Thread;->interrupted()Z
a=0;// 
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 146
a=0;//     .end local v2    # "hcon":Ljava/net/HttpURLConnection;
a=0;//     .end local v6    # "r":Ljava/io/RandomAccessFile;
a=0;//     .restart local v5    # "r":Ljava/io/RandomAccessFile;
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Reference,Ljava/io/RandomAccessFile;);v6=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 132
a=0;//     .end local v5    # "r":Ljava/io/RandomAccessFile;
a=0;//     .restart local v2    # "hcon":Ljava/net/HttpURLConnection;
a=0;//     .restart local v6    # "r":Ljava/io/RandomAccessFile;
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Reference,Ljava/net/HttpURLConnection;);v5=(Null);v6=(Reference,Ljava/io/RandomAccessFile;);v7=(Boolean);v8=(LongHi);v9=(LongLo);
a=0;//     int-to-long v7, v4
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     iget-wide v9, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->x:J
a=0;// 
a=0;//     add-long/2addr v7, v9
a=0;// 
a=0;//     iget-wide v9, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->end:J
a=0;// 
a=0;//     cmp-long v7, v7, v9
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-lez v7, :cond_4
a=0;// 
a=0;//     .line 133
a=0;//     iget-wide v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->end:J
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     iget-wide v9, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->x:J
a=0;// 
a=0;//     sub-long/2addr v7, v9
a=0;// 
a=0;//     long-to-int v4, v7
a=0;// 
a=0;//     .line 134
a=0;//     :cond_4
a=0;//     #v7=(Conflicted);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v0, v7, v4}, Ljava/io/RandomAccessFile;->write([BII)V
a=0;// 
a=0;//     .line 135
a=0;//     iget-wide v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->x:J
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     int-to-long v9, v4
a=0;// 
a=0;//     add-long/2addr v7, v9
a=0;// 
a=0;//     iput-wide v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->x:J
a=0;// 
a=0;//     .line 136
a=0;//     iget-wide v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->x:J
a=0;// 
a=0;//     iget-wide v9, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->start:J
a=0;// 
a=0;//     sub-long/2addr v7, v9
a=0;// 
a=0;//     iput-wide v7, p0, Lcom/twocloo/com/cn/http/Down$DownThread;->size:J
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 142
a=0;//     :catch_0
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 143
a=0;//     .end local v2    # "hcon":Ljava/net/HttpURLConnection;
a=0;//     .end local v6    # "r":Ljava/io/RandomAccessFile;
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     .restart local v5    # "r":Ljava/io/RandomAccessFile;
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v5=(Reference,Ljava/io/RandomAccessFile;);v6=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 142
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :catch_1
a=0;//     #v1=(Uninit);v4=(Byte);v5=(Null);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_2
a=0;// .end method
}}
