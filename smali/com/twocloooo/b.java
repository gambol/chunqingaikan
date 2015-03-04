package com.twocloooo; class b { void a() { int a;
a=0;// .class Lcom/twocloooo/b;
a=0;// .super Ljava/io/FilterOutputStream;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Z
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:[B
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:Z
a=0;// 
a=0;// .field private g:[B
a=0;// 
a=0;// .field private h:Z
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// .field private j:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/io/OutputStream;I)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/b;);
a=0;//     and-int/lit8 v0, p2, 0x8
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/twocloooo/b;->f:Z
a=0;// 
a=0;//     and-int/lit8 v0, p2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Lcom/twocloooo/b;->a:Z
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/twocloooo/b;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/twocloooo/b;->d:I
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloooo/b;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, Lcom/twocloooo/b;->c:[B
a=0;// 
a=0;//     iput v2, p0, Lcom/twocloooo/b;->b:I
a=0;// 
a=0;//     iput v2, p0, Lcom/twocloooo/b;->e:I
a=0;// 
a=0;//     iput-boolean v2, p0, Lcom/twocloooo/b;->h:Z
a=0;// 
a=0;//     new-array v0, v3, [B
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloooo/b;->g:[B
a=0;// 
a=0;//     iput p2, p0, Lcom/twocloooo/b;->i:I
a=0;// 
a=0;//     invoke-static {p2}, Lcom/twocloooo/a;->a(I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloooo/b;->j:[B
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Boolean);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a()V
a=0;//     .locals 5
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloooo/b;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/twocloooo/b;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/b;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/b;->g:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iget-object v2, p0, Lcom/twocloooo/b;->c:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     iget v3, p0, Lcom/twocloooo/b;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloooo/b;->i:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v1, v2, v3, v4}, Lcom/twocloooo/a;->a([B[BII)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloooo/b;->b:I
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "Base64 input not properly padded."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloooo/b;->a()V
a=0;// 
a=0;//     invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloooo/b;->c:[B
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloooo/b;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public write(I)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v2, -0x5
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iget-boolean v0, p0, Lcom/twocloooo/b;->h:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/b;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Byte);v3=(Uninit);v4=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/twocloooo/b;->a:Z
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/b;->c:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lcom/twocloooo/b;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/twocloooo/b;->b:I
a=0;// 
a=0;//     int-to-byte v2, p1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloooo/b;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloooo/b;->d:I
a=0;// 
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/b;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/b;->g:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iget-object v2, p0, Lcom/twocloooo/b;->c:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     iget v3, p0, Lcom/twocloooo/b;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloooo/b;->i:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v1, v2, v3, v4}, Lcom/twocloooo/a;->a([B[BII)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloooo/b;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloooo/b;->e:I
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/twocloooo/b;->f:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloooo/b;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x4c
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/b;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     iput v5, p0, Lcom/twocloooo/b;->e:I
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iput v5, p0, Lcom/twocloooo/b;->b:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Byte);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloooo/b;->j:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     and-int/lit8 v1, p1, 0x7f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-byte v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-le v0, v2, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/b;->c:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lcom/twocloooo/b;->b:I
a=0;// 
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/twocloooo/b;->b:I
a=0;// 
a=0;//     int-to-byte v2, p1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloooo/b;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloooo/b;->d:I
a=0;// 
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/b;->c:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget-object v1, p0, Lcom/twocloooo/b;->g:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iget v2, p0, Lcom/twocloooo/b;->i:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v5, v1, v5, v2}, Lcom/twocloooo/a;->a([BI[BII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloooo/b;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/b;->g:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-virtual {v1, v2, v5, v0}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     iput v5, p0, Lcom/twocloooo/b;->b:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Byte);v1=(Integer);v2=(Byte);
a=0;//     iget-object v0, p0, Lcom/twocloooo/b;->j:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     and-int/lit8 v1, p1, 0x7f
a=0;// 
a=0;//     aget-byte v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v0, v2, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "Invalid character in Base64 data."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public write([BII)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/twocloooo/b;->h:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/b;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     if-ge v0, p3, :cond_0
a=0;// 
a=0;//     add-int v1, p2, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-byte v1, p1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloooo/b;->write(I)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
