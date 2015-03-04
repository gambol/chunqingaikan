package net.slidingmenu.tools.b.b.d; class k { void a() { int a;
a=0;// .class public final Lnet/slidingmenu/tools/b/b/d/k;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private static final a(IIIII[I)I
a=0;//     .locals 3
a=0;// 
a=0;//     ushr-int/lit8 v0, p2, 0x5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     shl-int/lit8 v1, p1, 0x2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     xor-int/2addr v0, v1
a=0;// 
a=0;//     ushr-int/lit8 v1, p1, 0x3
a=0;// 
a=0;//     shl-int/lit8 v2, p2, 0x4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     xor-int/2addr v1, v2
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     xor-int v1, p0, p1
a=0;// 
a=0;//     and-int/lit8 v2, p3, 0x3
a=0;// 
a=0;//     xor-int/2addr v2, p4
a=0;// 
a=0;//     aget v2, p5, v2
a=0;// 
a=0;//     xor-int/2addr v2, p2
a=0;// 
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     xor-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static final a([B[B)[B
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, v0}, Lnet/slidingmenu/tools/b/b/d/k;->a([BZ)[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-static {p1, v2}, Lnet/slidingmenu/tools/b/b/d/k;->a([BZ)[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-static {v0, v1}, Lnet/slidingmenu/tools/b/b/d/k;->a([I[I)[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v2}, Lnet/slidingmenu/tools/b/b/d/k;->a([IZ)[B
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static final a([IZ)[B
a=0;//     .locals 5
a=0;// 
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     shl-int/lit8 v1, v0, 0x2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     array-length v0, p0
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     aget v0, p0, v0
a=0;// 
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_1
a=0;//     new-array v1, v0, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v2, v0, :cond_2
a=0;// 
a=0;//     ushr-int/lit8 v3, v2, 0x2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget v3, p0, v3
a=0;// 
a=0;//     and-int/lit8 v4, v2, 0x3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     shl-int/lit8 v4, v4, 0x3
a=0;// 
a=0;//     ushr-int/2addr v3, v4
a=0;// 
a=0;//     and-int/lit16 v3, v3, 0xff
a=0;// 
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v1, v2
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static final a([BZ)[I
a=0;//     .locals 7
a=0;// 
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x3
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     array-length v0, p0
a=0;// 
a=0;//     ushr-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v1, v2, :cond_2
a=0;// 
a=0;//     ushr-int/lit8 v3, v1, 0x2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget v4, v0, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aget-byte v5, p0, v1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     and-int/lit16 v5, v5, 0xff
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     and-int/lit8 v6, v1, 0x3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     shl-int/lit8 v6, v6, 0x3
a=0;// 
a=0;//     shl-int/2addr v5, v6
a=0;// 
a=0;//     or-int/2addr v4, v5
a=0;// 
a=0;//     aput v4, v0, v3
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     array-length v0, p0
a=0;// 
a=0;//     ushr-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     new-array v0, v1, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static final a([I[I)[I
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v8, v0, -0x1
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ge v8, v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(PosByte);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v9=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v1, :cond_3
a=0;// 
a=0;//     new-array v5, v1, [I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     invoke-static {p1, v6, v5, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     :goto_0
a=0;//     aget v2, p0, v8
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget v0, p0, v6
a=0;// 
a=0;//     const/16 v0, 0x34
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     add-int/lit8 v1, v8, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/2addr v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x6
a=0;// 
a=0;//     move v1, v6
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     add-int/lit8 v7, v0, -0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const v0, -0x61c88647
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     ushr-int/lit8 v1, v0, 0x2
a=0;// 
a=0;//     and-int/lit8 v4, v1, 0x3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v3, v6
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, v8, :cond_2
a=0;// 
a=0;//     add-int/lit8 v1, v3, 0x1
a=0;// 
a=0;//     aget v1, p0, v1
a=0;// 
a=0;//     aget v9, p0, v3
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static/range {v0 .. v5}, Lnet/slidingmenu/tools/b/b/d/k;->a(IIIII[I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int v2, v9, v1
a=0;// 
a=0;//     aput v2, p0, v3
a=0;// 
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v9=(Conflicted);
a=0;//     aget v1, p0, v6
a=0;// 
a=0;//     aget v9, p0, v8
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static/range {v0 .. v5}, Lnet/slidingmenu/tools/b/b/d/k;->a(IIIII[I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int v2, v9, v1
a=0;// 
a=0;//     aput v2, p0, v8
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     move v0, v7
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(PosByte);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v9=(Uninit);
a=0;//     move-object v5, p1
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     goto :goto_0
a=0;// .end method
}}
