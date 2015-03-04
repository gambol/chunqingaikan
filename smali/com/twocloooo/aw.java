package com.twocloooo; class aw { void a() { int a;
a=0;// .class public Lcom/twocloooo/aw;
a=0;// .super Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Ljava/net/HttpURLConnection;
a=0;// 
a=0;// .field private b:Ljava/io/File;
a=0;// 
a=0;// .field private c:Ljava/net/URL;
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// .field private g:Z
a=0;// 
a=0;// .field private h:Lcom/twocloooo/av;
a=0;// 
a=0;// .field private i:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/twocloooo/av;Ljava/net/URL;Ljava/io/File;III)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/aw;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/twocloooo/aw;->e:I
a=0;// 
a=0;//     iput-boolean v1, p0, Lcom/twocloooo/aw;->g:Z
a=0;// 
a=0;//     iput-boolean v1, p0, Lcom/twocloooo/aw;->i:Z
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloooo/aw;->c:Ljava/net/URL;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloooo/aw;->b:Ljava/io/File;
a=0;// 
a=0;//     iput p4, p0, Lcom/twocloooo/aw;->d:I
a=0;// 
a=0;//     iput-object p1, p0, Lcom/twocloooo/aw;->h:Lcom/twocloooo/av;
a=0;// 
a=0;//     iput p6, p0, Lcom/twocloooo/aw;->e:I
a=0;// 
a=0;//     iput p5, p0, Lcom/twocloooo/aw;->f:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/twocloooo/aw;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public b()J
a=0;//     .locals 2
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloooo/aw;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public run()V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     iget v0, p0, Lcom/twocloooo/aw;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloooo/aw;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/twocloooo/aw;->c:Ljava/net/URL;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloooo/aw;->a:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/aw;->a:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/16 v1, 0x7530
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/aw;->a:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/16 v1, 0x7530
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/aw;->a:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "GET"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/aw;->a:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "Accept-Encoding"
a=0;// 
a=0;//     const-string v2, "identity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v0}, Ljava/net/HttpURLConnection;->setFollowRedirects(Z)V
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloooo/aw;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloooo/aw;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     mul-int/2addr v0, v1
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloooo/aw;->f:I
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloooo/aw;->d:I
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloooo/aw;->e:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/2addr v1, v2
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/aw;->a:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v3, "Range"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "bytes="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "-"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v3, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/aw;->a:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Lcom/twocloooo/aw;->i:Z
a=0;// 
a=0;//     const/16 v2, 0x1000
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     new-array v2, v2, [B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     new-instance v3, Ljava/io/RandomAccessFile;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/RandomAccessFile;);
a=0;//     iget-object v4, p0, Lcom/twocloooo/aw;->b:Ljava/io/File;
a=0;// 
a=0;//     const-string v5, "rwd"
a=0;// 
a=0;//     invoke-direct {v3, v4, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/RandomAccessFile;);
a=0;//     int-to-long v4, v0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V
a=0;// 
a=0;//     new-instance v0, Lcom/twocloooo/ax;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloooo/ax;);
a=0;//     invoke-direct {v0}, Lcom/twocloooo/ax;-><init>()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/twocloooo/ax;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/16 v5, 0x1000
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-virtual {v1, v2, v4, v5}, Ljava/io/InputStream;->read([BII)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v7, :cond_1
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloooo/aw;->g:Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/twocloooo/ax;);v1=(Reference,Ljava/io/InputStream;);v2=(Reference,[B);v3=(Reference,Ljava/io/RandomAccessFile;);v4=(Integer);v5=(PosShort);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3, v2, v5, v4}, Ljava/io/RandomAccessFile;->write([BII)V
a=0;// 
a=0;//     iget v5, p0, Lcom/twocloooo/aw;->f:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v5, v4
a=0;// 
a=0;//     iput v5, p0, Lcom/twocloooo/aw;->f:I
a=0;// 
a=0;//     iget v5, p0, Lcom/twocloooo/aw;->f:I
a=0;// 
a=0;//     iput v5, v0, Lcom/twocloooo/ax;->b:I
a=0;// 
a=0;//     iget v5, p0, Lcom/twocloooo/aw;->e:I
a=0;// 
a=0;//     iput v5, v0, Lcom/twocloooo/ax;->a:I
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloooo/aw;->h:Lcom/twocloooo/av;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloooo/av;);
a=0;//     invoke-virtual {v5, v4}, Lcom/twocloooo/av;->a(I)V
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloooo/aw;->h:Lcom/twocloooo/av;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloooo/av;);
a=0;//     iget v5, p0, Lcom/twocloooo/aw;->e:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Lcom/twocloooo/aw;->f:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v5, v6, v0}, Lcom/twocloooo/av;->a(IILcom/twocloooo/ax;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     iput v7, p0, Lcom/twocloooo/aw;->f:I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
