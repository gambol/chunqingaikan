package net.slidingmenu.tools.b.b.d; class c { void a() { int a;
a=0;// .class Lnet/slidingmenu/tools/b/b/d/c;
a=0;// .super Ljava/io/InputStream;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/io/InputStream;
a=0;// 
a=0;// .field private b:[I
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/InputStream;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/io/InputStream;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/d/c;);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/d/c;->c:I
a=0;// 
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/b/d/c;->d:Z
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/b/d/c;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v5, v8, [C
a=0;// 
a=0;//     #v5=(Reference,[C);
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v4=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/b/b/d/c;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v4}, Ljava/io/InputStream;->read()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v9, :cond_3
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "Bad base64 stream"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     new-array v0, v1, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/d/c;->b:[I
a=0;// 
a=0;//     iput-boolean v2, p0, Lnet/slidingmenu/tools/b/b/d/c;->d:Z
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(PosByte);v3=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Null);v2=(One);v3=(PosByte);v7=(Uninit);
a=0;//     int-to-char v6, v4
a=0;// 
a=0;//     #v6=(Char);
a=0;//     sget-object v4, Lnet/slidingmenu/tools/b/b/d/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v9, :cond_4
a=0;// 
a=0;//     sget-char v4, Lnet/slidingmenu/tools/b/b/d/e;->b:C
a=0;// 
a=0;//     #v4=(Char);
a=0;//     if-ne v6, v4, :cond_6
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v0, 0x1
a=0;// 
a=0;//     aput-char v6, v5, v0
a=0;// 
a=0;//     move v0, v4
a=0;// 
a=0;//     :cond_5
a=0;//     if-lt v0, v8, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v4, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v7=(Conflicted);
a=0;//     if-ge v4, v8, :cond_9
a=0;// 
a=0;//     aget-char v6, v5, v4
a=0;// 
a=0;//     sget-char v7, Lnet/slidingmenu/tools/b/b/d/e;->b:C
a=0;// 
a=0;//     #v7=(Char);
a=0;//     if-eq v6, v7, :cond_7
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "Bad base64 stream"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Null);v4=(Char);v7=(Uninit);
a=0;//     const/16 v4, 0xd
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-eq v6, v4, :cond_5
a=0;// 
a=0;//     const/16 v4, 0xa
a=0;// 
a=0;//     if-eq v6, v4, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "Bad base64 stream"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(Null);v4=(Integer);v7=(Char);
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :cond_8
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_9
a=0;//     #v7=(Conflicted);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aget-char v0, v5, v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     sget-char v4, Lnet/slidingmenu/tools/b/b/d/e;->b:C
a=0;// 
a=0;//     #v4=(Char);
a=0;//     if-ne v0, v4, :cond_d
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/d/c;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->read()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v9, :cond_a
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "Bad base64 stream"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     iput-boolean v2, p0, Lnet/slidingmenu/tools/b/b/d/c;->d:Z
a=0;// 
a=0;//     aget-char v0, v5, v3
a=0;// 
a=0;//     #v0=(Char);
a=0;//     sget-char v4, Lnet/slidingmenu/tools/b/b/d/e;->b:C
a=0;// 
a=0;//     if-ne v0, v4, :cond_c
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(PosByte);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v3, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v3=(Integer);v4=(Integer);v6=(Integer);
a=0;//     if-ge v3, v8, :cond_e
a=0;// 
a=0;//     aget-char v4, v5, v3
a=0;// 
a=0;//     #v4=(Char);
a=0;//     sget-char v6, Lnet/slidingmenu/tools/b/b/d/e;->b:C
a=0;// 
a=0;//     #v6=(Char);
a=0;//     if-eq v4, v6, :cond_b
a=0;// 
a=0;//     sget-object v4, Lnet/slidingmenu/tools/b/b/d/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aget-char v6, v5, v3
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     rsub-int/lit8 v6, v3, 0x3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-int/lit8 v6, v6, 0x6
a=0;// 
a=0;//     shl-int/2addr v4, v6
a=0;// 
a=0;//     or-int/2addr v0, v4
a=0;// 
a=0;//     :cond_b
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Char);v2=(One);v3=(PosByte);v4=(Char);v6=(Char);
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_d
a=0;//     #v2=(One);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Integer);v3=(Integer);v4=(Integer);v6=(Integer);
a=0;//     new-array v3, v2, [I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     iput-object v3, p0, Lnet/slidingmenu/tools/b/b/d/c;->b:[I
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v2, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/b/d/c;->b:[I
a=0;// 
a=0;//     rsub-int/lit8 v4, v1, 0x2
a=0;// 
a=0;//     mul-int/lit8 v4, v4, 0x8
a=0;// 
a=0;//     ushr-int v4, v0, v4
a=0;// 
a=0;//     and-int/lit16 v4, v4, 0xff
a=0;// 
a=0;//     aput v4, v3, v1
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/d/c;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public read()I
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/d/c;->b:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/d/c;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/d/c;->b:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-boolean v1, p0, Lnet/slidingmenu/tools/b/b/d/c;->d:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Boolean);
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/b/d/c;->a()V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/d/c;->b:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/b/d/c;->b:[I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/d/c;->c:I
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/d/c;->b:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/d/c;->c:I
a=0;// 
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/b/d/c;->c:I
a=0;// 
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
}}
