package u.aly; class de { void a() { int a;
a=0;// .class public final Lu/aly/de;
a=0;// .super Lu/aly/cs;
a=0;// .source "TTupleProtocol.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lu/aly/de$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lu/aly/dm;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0, p1}, Lu/aly/cs;-><init>(Lu/aly/dm;)V
a=0;// 
a=0;//     .line 42
a=0;//     #p0=(Reference,Lu/aly/de;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a([B)Ljava/util/BitSet;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     new-instance v1, Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/BitSet;);
a=0;//     invoke-direct {v1}, Ljava/util/BitSet;-><init>()V
a=0;// 
a=0;//     .line 73
a=0;//     #v1=(Reference,Ljava/util/BitSet;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/lit8 v2, v2, 0x8
a=0;// 
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     return-object v1
a=0;// 
a=0;//     .line 74
a=0;//     :cond_0
a=0;//     array-length v2, p0
a=0;// 
a=0;//     div-int/lit8 v3, v0, 0x8
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     aget-byte v2, p0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     rem-int/lit8 v4, v0, 0x8
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     shl-int/2addr v3, v4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v2, v3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 73
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/util/BitSet;I)[B
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     int-to-double v0, p1
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide/high16 v2, 0x4020000000000000L    # 8.0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     div-double/2addr v0, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v1, v0, [B
a=0;// 
a=0;//     .line 94
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/util/BitSet;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     return-object v1
a=0;// 
a=0;//     .line 95
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v0}, Ljava/util/BitSet;->get(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 96
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int/lit8 v3, v0, 0x8
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     aget-byte v3, v1, v2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     rem-int/lit8 v5, v0, 0x8
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     shl-int/2addr v4, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     or-int/2addr v3, v4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v1, v2
a=0;// 
a=0;//     .line 94
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public D()Ljava/lang/Class;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lu/aly/dg;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     const-class v0, Lu/aly/dj;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/util/BitSet;I)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lu/aly/cf;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-static {p1, p2}, Lu/aly/de;->b(Ljava/util/BitSet;I)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 52
a=0;//     #v1=(Reference,[B);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// 
a=0;//     .line 52
a=0;//     :cond_0
a=0;//     aget-byte v3, v1, v0
a=0;// 
a=0;//     .line 53
a=0;//     #v3=(Byte);
a=0;//     invoke-virtual {p0, v3}, Lu/aly/de;->a(B)V
a=0;// 
a=0;//     .line 52
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b(I)Ljava/util/BitSet;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lu/aly/cf;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     int-to-double v0, p1
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide/high16 v2, 0x4020000000000000L    # 8.0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     div-double/2addr v0, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     double-to-int v1, v0
a=0;// 
a=0;//     .line 59
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [B
a=0;// 
a=0;//     .line 60
a=0;//     #v2=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     invoke-static {v2}, Lu/aly/de;->a([B)Ljava/util/BitSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 64
a=0;//     #v0=(Reference,Ljava/util/BitSet;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lu/aly/de;->u()B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v2, v0
a=0;// 
a=0;//     .line 60
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
