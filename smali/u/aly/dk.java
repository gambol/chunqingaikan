package u.aly; class dk { void a() { int a;
a=0;// .class public Lu/aly/dk;
a=0;// .super Lu/aly/dm;
a=0;// .source "TIOStreamTransport.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Ljava/io/InputStream;
a=0;// 
a=0;// .field protected b:Ljava/io/OutputStream;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 45
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lu/aly/dm;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lu/aly/dk;);
a=0;//     iput-object v0, p0, Lu/aly/dk;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object v0, p0, Lu/aly/dk;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/InputStream;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lu/aly/dm;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lu/aly/dk;);
a=0;//     iput-object v0, p0, Lu/aly/dk;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object v0, p0, Lu/aly/dk;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     .line 53
a=0;//     iput-object p1, p0, Lu/aly/dk;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 71
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lu/aly/dm;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lu/aly/dk;);
a=0;//     iput-object v0, p0, Lu/aly/dk;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object v0, p0, Lu/aly/dk;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     .line 72
a=0;//     iput-object p1, p0, Lu/aly/dk;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 73
a=0;//     iput-object p2, p0, Lu/aly/dk;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/OutputStream;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lu/aly/dm;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lu/aly/dk;);
a=0;//     iput-object v0, p0, Lu/aly/dk;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object v0, p0, Lu/aly/dk;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     .line 62
a=0;//     iput-object p1, p0, Lu/aly/dk;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a([BII)I
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lu/aly/dn;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lu/aly/dk;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     new-instance v0, Lu/aly/dn;
a=0;// 
a=0;//     #v0=(UninitRef,Lu/aly/dn;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, "Cannot read from null inputStream"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lu/aly/dn;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/dn;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lu/aly/dk;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 126
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v0, Lu/aly/dn;
a=0;// 
a=0;//     #v0=(UninitRef,Lu/aly/dn;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Lu/aly/dn;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/dn;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 123
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 124
a=0;//     new-instance v1, Lu/aly/dn;
a=0;// 
a=0;//     #v1=(UninitRef,Lu/aly/dn;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, v2, v0}, Lu/aly/dn;-><init>(ILjava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lu/aly/dn;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 129
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public b()V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lu/aly/dn;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b([BII)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lu/aly/dn;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     iget-object v0, p0, Lu/aly/dk;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     new-instance v0, Lu/aly/dn;
a=0;// 
a=0;//     #v0=(UninitRef,Lu/aly/dn;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, "Cannot write to null outputStream"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lu/aly/dn;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/dn;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lu/aly/dk;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 144
a=0;//     return-void
a=0;// 
a=0;//     .line 141
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 142
a=0;//     new-instance v1, Lu/aly/dn;
a=0;// 
a=0;//     #v1=(UninitRef,Lu/aly/dn;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, v2, v0}, Lu/aly/dn;-><init>(ILjava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lu/aly/dn;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public c()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lu/aly/dk;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lu/aly/dk;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 101
a=0;//     :goto_0
a=0;//     iput-object v1, p0, Lu/aly/dk;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lu/aly/dk;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 105
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lu/aly/dk;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 109
a=0;//     :goto_1
a=0;//     iput-object v1, p0, Lu/aly/dk;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     .line 111
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     .line 98
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 99
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 107
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public d()V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lu/aly/dn;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     iget-object v0, p0, Lu/aly/dk;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     new-instance v0, Lu/aly/dn;
a=0;// 
a=0;//     #v0=(UninitRef,Lu/aly/dn;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, "Cannot flush null outputStream"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lu/aly/dn;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/dn;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lu/aly/dk;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// 
a=0;//     .line 155
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 156
a=0;//     new-instance v1, Lu/aly/dn;
a=0;// 
a=0;//     #v1=(UninitRef,Lu/aly/dn;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, v2, v0}, Lu/aly/dn;-><init>(ILjava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lu/aly/dn;);
a=0;//     throw v1
a=0;// .end method
}}
