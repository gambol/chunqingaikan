package net.slidingmenu.tools.b.b.f; class e { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/f/e;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:[B
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>([B)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/f/e;);
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/b/f/e;->a:[B
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->c:I
a=0;// 
a=0;//     iput v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->d:I
a=0;// 
a=0;//     iput v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->e:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/b/f/e;->b()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le p1, v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "end of input"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt p1, v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "cannot jump past end of input"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iput p1, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->c:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a([BII)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p3}, Lnet/slidingmenu/tools/b/b/f/e;->c(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p3
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()I
a=0;//     .locals 2
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public b(I)[B
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/b/b/f/e;->c(I)V
a=0;// 
a=0;//     new-array v0, p1, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->a:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v1, v2, v0, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, p1
a=0;// 
a=0;//     iput v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public c()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->d:I
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->c:I
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->e:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public d()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "no previous state"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Byte);
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->d:I
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->e:I
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->c:I
a=0;// 
a=0;//     iput v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->d:I
a=0;// 
a=0;//     iput v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->e:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public e()I
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/b/b/f/e;->c(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     aget-byte v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public f()I
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/b/b/f/e;->c(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     aget-byte v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->a:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     add-int/lit8 v3, v2, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     aget-byte v1, v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shl-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public g()J
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/b/b/f/e;->c(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/e;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     aget-byte v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/e;->a:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     add-int/lit8 v3, v2, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     aget-byte v1, v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/f/e;->a:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     iget v3, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     aget-byte v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     and-int/lit16 v2, v2, 0xff
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/b/f/e;->a:[B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     iget v4, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     add-int/lit8 v5, v4, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lnet/slidingmenu/tools/b/b/f/e;->b:I
a=0;// 
a=0;//     aget-byte v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/lit16 v3, v3, 0xff
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v4, v0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/16 v0, 0x18
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     shl-long/2addr v4, v0
a=0;// 
a=0;//     shl-int/lit8 v0, v1, 0x10
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     add-long/2addr v0, v4
a=0;// 
a=0;//     shl-int/lit8 v2, v2, 0x8
a=0;// 
a=0;//     int-to-long v4, v2
a=0;// 
a=0;//     add-long/2addr v0, v4
a=0;// 
a=0;//     int-to-long v2, v3
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     return-wide v0
a=0;// .end method
}}
