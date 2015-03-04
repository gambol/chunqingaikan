package net.slidingmenu.tools.onlineconfig.ntp; class b { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/onlineconfig/ntp/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:B
a=0;// 
a=0;// .field public b:B
a=0;// 
a=0;// .field public c:B
a=0;// 
a=0;// .field public d:S
a=0;// 
a=0;// .field public e:B
a=0;// 
a=0;// .field public f:B
a=0;// 
a=0;// .field public g:D
a=0;// 
a=0;// .field public h:D
a=0;// 
a=0;// .field public i:[B
a=0;// 
a=0;// .field public j:D
a=0;// 
a=0;// .field public k:D
a=0;// 
a=0;// .field public l:D
a=0;// 
a=0;// .field public m:D
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/onlineconfig/ntp/b;);
a=0;//     iput-byte v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a:B
a=0;// 
a=0;//     iput-byte v3, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->b:B
a=0;// 
a=0;//     iput-byte v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->c:B
a=0;// 
a=0;//     iput-short v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->d:S
a=0;// 
a=0;//     iput-byte v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->e:B
a=0;// 
a=0;//     iput-byte v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->f:B
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->g:D
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->h:D
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->i:[B
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->j:D
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->k:D
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->l:D
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->m:D
a=0;// 
a=0;//     iput-byte v3, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->c:B
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     long-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide v2, 0x408f400000000000L    # 1000.0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     div-double/2addr v0, v2
a=0;// 
a=0;//     const-wide v2, 0x41e0754fd0000000L    # 2.2089888E9
a=0;// 
a=0;//     add-double/2addr v0, v2
a=0;// 
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->m:D
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 1
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>([B)V
a=0;//     .locals 10
a=0;// 
a=0;//     const-wide/high16 v8, 0x40f0000000000000L    # 65536.0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const-wide/high16 v5, 0x4070000000000000L    # 256.0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/onlineconfig/ntp/b;);
a=0;//     iput-byte v4, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a:B
a=0;// 
a=0;//     iput-byte v7, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->b:B
a=0;// 
a=0;//     iput-byte v4, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->c:B
a=0;// 
a=0;//     iput-short v4, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->d:S
a=0;// 
a=0;//     iput-byte v4, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->e:B
a=0;// 
a=0;//     iput-byte v4, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->f:B
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->g:D
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->h:D
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->i:[B
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->j:D
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->k:D
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->l:D
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->m:D
a=0;// 
a=0;//     aget-byte v0, p1, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     shr-int/lit8 v0, v0, 0x6
a=0;// 
a=0;//     and-int/lit8 v0, v0, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput-byte v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a:B
a=0;// 
a=0;//     aget-byte v0, p1, v4
a=0;// 
a=0;//     shr-int/lit8 v0, v0, 0x3
a=0;// 
a=0;//     and-int/lit8 v0, v0, 0x7
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput-byte v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->b:B
a=0;// 
a=0;//     aget-byte v0, p1, v4
a=0;// 
a=0;//     and-int/lit8 v0, v0, 0x7
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput-byte v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->c:B
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     aget-byte v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     iput-short v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->d:S
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aget-byte v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput-byte v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->e:B
a=0;// 
a=0;//     aget-byte v0, p1, v7
a=0;// 
a=0;//     iput-byte v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->f:B
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aget-byte v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     mul-double/2addr v0, v5
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Short);
a=0;//     int-to-double v2, v2
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     add-double/2addr v0, v2
a=0;// 
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Short);
a=0;//     int-to-double v2, v2
a=0;// 
a=0;//     #v2=(DoubleLo);
a=0;//     div-double/2addr v2, v5
a=0;// 
a=0;//     add-double/2addr v0, v2
a=0;// 
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Short);
a=0;//     int-to-double v2, v2
a=0;// 
a=0;//     #v2=(DoubleLo);
a=0;//     div-double/2addr v2, v8
a=0;// 
a=0;//     add-double/2addr v0, v2
a=0;// 
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->g:D
a=0;// 
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aget-byte v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     mul-double/2addr v0, v5
a=0;// 
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Short);
a=0;//     int-to-double v2, v2
a=0;// 
a=0;//     #v2=(DoubleLo);
a=0;//     add-double/2addr v0, v2
a=0;// 
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Short);
a=0;//     int-to-double v2, v2
a=0;// 
a=0;//     #v2=(DoubleLo);
a=0;//     div-double/2addr v2, v5
a=0;// 
a=0;//     add-double/2addr v0, v2
a=0;// 
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Short);
a=0;//     int-to-double v2, v2
a=0;// 
a=0;//     #v2=(DoubleLo);
a=0;//     div-double/2addr v2, v8
a=0;// 
a=0;//     add-double/2addr v0, v2
a=0;// 
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->h:D
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->i:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     const/16 v1, 0xc
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aget-byte v1, p1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, v0, v4
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->i:[B
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->i:[B
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/16 v2, 0xe
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->i:[B
a=0;// 
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     aget-byte v1, p1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, v0, v7
a=0;// 
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p1, v0}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a([BI)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->j:D
a=0;// 
a=0;//     const/16 v0, 0x18
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p1, v0}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a([BI)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->k:D
a=0;// 
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p1, v0}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a([BI)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->l:D
a=0;// 
a=0;//     const/16 v0, 0x28
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p1, v0}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a([BI)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->m:D
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 1
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public static a([BI)D
a=0;//     .locals 9
a=0;// 
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     add-int v3, p1, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-byte v3, p0, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-static {v3}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Short);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     const-wide/high16 v5, 0x4000000000000000L    # 2.0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     rsub-int/lit8 v7, v0, 0x3
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     mul-int/lit8 v7, v7, 0x8
a=0;// 
a=0;//     int-to-double v7, v7
a=0;// 
a=0;//     #v7=(DoubleLo);v8=(DoubleHi);
a=0;//     invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     mul-double/2addr v3, v5
a=0;// 
a=0;//     add-double/2addr v1, v3
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(LongLo);v2=(LongHi);v3=(PosByte);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-wide v1
a=0;// .end method
a=0;// 
a=0;// .method public static a(D)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmpl-double v0, p0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(LongHi);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-wide v0, 0x41e0754fd0000000L    # 2.2089888E9
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     sub-double v0, p0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide v2, 0x408f400000000000L    # 1000.0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-double/2addr v0, v2
a=0;// 
a=0;//     double-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     new-instance v2, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v3, "dd-MMM-yyyy HH:mm:ss"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v3, Ljava/util/Date;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v3, v0, v1}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     double-to-long v1, p0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     long-to-double v1, v1
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     sub-double v1, p0, v1
a=0;// 
a=0;//     new-instance v3, Ljava/text/DecimalFormat;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/text/DecimalFormat;);
a=0;//     const-string v4, ".000000"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/text/DecimalFormat;);
a=0;//     invoke-virtual {v3, v1, v2}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a([BSB)Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-ne p1, v5, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p0}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Uninit);
a=0;//     if-ne p2, v7, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     aget-byte v1, p0, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Short);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aget-byte v1, p0, v5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Short);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aget-byte v1, p0, v8
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Short);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aget-byte v1, p0, v7
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Short);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p2, v0, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aget-byte v1, p0, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Short);
a=0;//     int-to-double v1, v1
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     const-wide/high16 v3, 0x4070000000000000L    # 256.0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     div-double/2addr v1, v3
a=0;// 
a=0;//     aget-byte v3, p0, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-static {v3}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Short);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     const-wide/high16 v5, 0x40f0000000000000L    # 65536.0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     div-double/2addr v3, v5
a=0;// 
a=0;//     add-double/2addr v1, v3
a=0;// 
a=0;//     aget-byte v3, p0, v8
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-static {v3}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Short);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     const-wide/high16 v5, 0x4170000000000000L    # 1.6777216E7
a=0;// 
a=0;//     div-double/2addr v3, v5
a=0;// 
a=0;//     add-double/2addr v1, v3
a=0;// 
a=0;//     aget-byte v3, p0, v7
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-static {v3}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Short);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     const-wide/high16 v5, 0x41f0000000000000L    # 4.294967296E9
a=0;// 
a=0;//     div-double/2addr v3, v5
a=0;// 
a=0;//     add-double/2addr v1, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(PosByte);v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Uninit);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(B)S
a=0;//     .locals 2
a=0;// 
a=0;//     and-int/lit16 v0, p0, 0x80
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x80
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     and-int/lit8 v0, p0, 0x7f
a=0;// 
a=0;//     add-int/lit16 v0, v0, 0x80
a=0;// 
a=0;//     int-to-short v0, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Short);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     int-to-short v0, p0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a([BID)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     const-wide/high16 v1, 0x4000000000000000L    # 2.0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     rsub-int/lit8 v3, v0, 0x3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-int/lit8 v3, v3, 0x8
a=0;// 
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     add-int v3, p1, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-double v4, p2, v1
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     double-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-byte v4, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, p0, v3
a=0;// 
a=0;//     add-int v3, p1, v0
a=0;// 
a=0;//     aget-byte v3, p0, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-static {v3}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(B)S
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Short);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     mul-double/2addr v1, v3
a=0;// 
a=0;//     sub-double/2addr p2, v1
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(PosByte);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/4 v0, 0x7
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {}, Ljava/lang/Math;->random()D
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     const-wide v3, 0x406fe00000000000L    # 255.0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     mul-double/2addr v1, v3
a=0;// 
a=0;//     double-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, p0, v0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()[B
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const-wide/high16 v4, 0x40f0000000000000L    # 65536.0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0xff
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const/16 v0, 0x30
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget-byte v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a:B
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     shl-int/lit8 v1, v1, 0x6
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-byte v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->b:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     shl-int/lit8 v2, v2, 0x3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     or-int/2addr v1, v2
a=0;// 
a=0;//     iget-byte v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->c:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     or-int/2addr v1, v2
a=0;// 
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, v0, v8
a=0;// 
a=0;//     iget-short v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->d:S
a=0;// 
a=0;//     #v1=(Short);
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, v0, v9
a=0;// 
a=0;//     iget-byte v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->e:B
a=0;// 
a=0;//     aput-byte v1, v0, v10
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iget-byte v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->f:B
a=0;// 
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->g:D
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     mul-double/2addr v1, v4
a=0;// 
a=0;//     double-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     shr-int/lit8 v3, v1, 0x18
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/lit16 v3, v3, 0xff
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v0, v2
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     shr-int/lit8 v3, v1, 0x10
a=0;// 
a=0;//     #v3=(Short);
a=0;//     and-int/lit16 v3, v3, 0xff
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v0, v2
a=0;// 
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     shr-int/lit8 v3, v1, 0x8
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit16 v3, v3, 0xff
a=0;// 
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v0, v2
a=0;// 
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, v0, v2
a=0;// 
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->h:D
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     mul-double/2addr v1, v4
a=0;// 
a=0;//     double-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v4, 0x18
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     shr-long v4, v1, v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     and-long/2addr v4, v6
a=0;// 
a=0;//     long-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-byte v4, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v0, v3
a=0;// 
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     const/16 v4, 0x10
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     shr-long v4, v1, v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     and-long/2addr v4, v6
a=0;// 
a=0;//     long-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-byte v4, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v0, v3
a=0;// 
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     shr-long v4, v1, v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     and-long/2addr v4, v6
a=0;// 
a=0;//     long-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-byte v4, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v0, v3
a=0;// 
a=0;//     const/16 v3, 0xb
a=0;// 
a=0;//     and-long/2addr v1, v6
a=0;// 
a=0;//     long-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, v0, v3
a=0;// 
a=0;//     const/16 v1, 0xc
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->i:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     aget-byte v2, v2, v8
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->i:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     aget-byte v2, v2, v9
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->i:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     aget-byte v2, v2, v10
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->i:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     aget-byte v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     iget-wide v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->j:D
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     invoke-static {v0, v1, v2, v3}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a([BID)V
a=0;// 
a=0;//     const/16 v1, 0x18
a=0;// 
a=0;//     iget-wide v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->k:D
a=0;// 
a=0;//     invoke-static {v0, v1, v2, v3}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a([BID)V
a=0;// 
a=0;//     const/16 v1, 0x20
a=0;// 
a=0;//     iget-wide v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->l:D
a=0;// 
a=0;//     invoke-static {v0, v1, v2, v3}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a([BID)V
a=0;// 
a=0;//     const/16 v1, 0x28
a=0;// 
a=0;//     iget-wide v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->m:D
a=0;// 
a=0;//     invoke-static {v0, v1, v2, v3}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a([BID)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const-wide v5, 0x408f400000000000L    # 1000.0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     new-instance v0, Ljava/text/DecimalFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/DecimalFormat;);
a=0;//     const-string v1, "0.#E0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/DecimalFormat;);
a=0;//     const-wide/high16 v1, 0x4000000000000000L    # 2.0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-byte v3, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->f:B
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Leap indicator: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-byte v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\nVersion: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-byte v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->b:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\nMode: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-byte v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->c:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\nStratum: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-short v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->d:S
a=0;// 
a=0;//     #v2=(Short);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\nPoll: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-byte v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->e:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\nPrecision: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-byte v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->f:B
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " ("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " seconds)"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\nRoot delay: "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/text/DecimalFormat;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/text/DecimalFormat;);
a=0;//     const-string v2, "0.00"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/text/DecimalFormat;);
a=0;//     iget-wide v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->g:D
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     mul-double/2addr v2, v5
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " ms "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\nRoot dispersion: "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/text/DecimalFormat;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/text/DecimalFormat;);
a=0;//     const-string v2, "0.00"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/text/DecimalFormat;);
a=0;//     iget-wide v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->h:D
a=0;// 
a=0;//     #v2=(DoubleLo);
a=0;//     mul-double/2addr v2, v5
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " ms "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\nReference identifier: "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->i:[B
a=0;// 
a=0;//     iget-short v2, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->d:S
a=0;// 
a=0;//     #v2=(Short);
a=0;//     iget-byte v3, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->b:B
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a([BSB)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n\u53c2\u8003\u65f6\u95f4\u6233:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->j:D
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     invoke-static {v1, v2}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n\u672c\u5730\u65f6\u95f4\u6233:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->k:D
a=0;// 
a=0;//     #v1=(DoubleLo);
a=0;//     invoke-static {v1, v2}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n\u63a5\u6536\u65f6\u95f4\u6233:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->l:D
a=0;// 
a=0;//     #v1=(DoubleLo);
a=0;//     invoke-static {v1, v2}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n\u4f20\u8f93\u65f6\u95f4\u6233:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->m:D
a=0;// 
a=0;//     #v1=(DoubleLo);
a=0;//     invoke-static {v1, v2}, Lnet/slidingmenu/tools/onlineconfig/ntp/b;->a(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
