package u.aly; class bw { void a() { int a;
a=0;// .class public Lu/aly/bw;
a=0;// .super Ljava/lang/Object;
a=0;// .source "EncodingUtils.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lu/aly/bw;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final a(BIZ)B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     invoke-static {p0, p1, p2}, Lu/aly/bw;->a(IIZ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static final a(IIZ)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     shl-int/2addr v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     or-int/2addr v0, p0
a=0;// 
a=0;//     .line 139
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {p0, p1}, Lu/aly/bw;->b(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static final a([B)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0}, Lu/aly/bw;->a([BI)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static final a([BI)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     aget-byte v0, p0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     shl-int/lit8 v0, v0, 0x18
a=0;// 
a=0;//     add-int/lit8 v1, p1, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-byte v1, p0, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shl-int/lit8 v1, v1, 0x10
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 82
a=0;//     add-int/lit8 v1, p1, 0x2
a=0;// 
a=0;//     aget-byte v1, p0, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shl-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     .line 81
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 82
a=0;//     add-int/lit8 v1, p1, 0x3
a=0;// 
a=0;//     aget-byte v1, p0, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     .line 81
a=0;//     #v1=(Integer);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static final a(JIZ)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     const-wide/16 v0, 0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     shl-long/2addr v0, p2
a=0;// 
a=0;//     or-long/2addr v0, p0
a=0;// 
a=0;//     .line 146
a=0;//     :goto_0
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-static {p0, p1, p2}, Lu/aly/bw;->b(JI)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static final a(SIZ)S
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     invoke-static {p0, p1, p2}, Lu/aly/bw;->a(IIZ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-short v0, v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static final a(I[B)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, v0}, Lu/aly/bw;->a(I[BI)V
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final a(I[BI)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     shr-int/lit8 v0, p0, 0x18
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     aput-byte v0, p1, p2
a=0;// 
a=0;//     .line 53
a=0;//     add-int/lit8 v0, p2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     shr-int/lit8 v1, p0, 0x10
a=0;// 
a=0;//     #v1=(Short);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, p1, v0
a=0;// 
a=0;//     .line 54
a=0;//     add-int/lit8 v0, p2, 0x2
a=0;// 
a=0;//     shr-int/lit8 v1, p0, 0x8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, p1, v0
a=0;// 
a=0;//     .line 55
a=0;//     add-int/lit8 v0, p2, 0x3
a=0;// 
a=0;//     and-int/lit16 v1, p0, 0xff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, p1, v0
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final a(BI)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     invoke-static {p0, p1}, Lu/aly/bw;->a(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static final a(II)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 98
a=0;//     #v0=(One);
a=0;//     shl-int v1, v0, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v1, p0
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static final a(JI)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     const-wide/16 v0, 0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     shl-long/2addr v0, p2
a=0;// 
a=0;//     and-long/2addr v0, p0
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static final a(SI)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     invoke-static {p0, p1}, Lu/aly/bw;->a(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static final b(BI)B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     invoke-static {p0, p1}, Lu/aly/bw;->b(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static final b(II)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     shl-int/2addr v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     xor-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     and-int/2addr v0, p0
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static final b(JI)J
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     const-wide/16 v0, 0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     shl-long/2addr v0, p2
a=0;// 
a=0;//     const-wide/16 v2, -0x1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     xor-long/2addr v0, v2
a=0;// 
a=0;//     and-long/2addr v0, p0
a=0;// 
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public static final b(SI)S
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     invoke-static {p0, p1}, Lu/aly/bw;->b(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-short v0, v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     return v0
a=0;// .end method
}}
