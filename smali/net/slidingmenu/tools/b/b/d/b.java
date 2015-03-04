package net.slidingmenu.tools.b.b.d; class b { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/d/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final a:[C
a=0;// 
a=0;// .field private static final b:[C
a=0;// 
a=0;// .field private static c:[I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/d/b;->b:[C
a=0;// 
a=0;//     const/16 v0, 0xb
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/d/b;->c:[I
a=0;// 
a=0;//     const-string v0, "0123456789ABCDEF"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/d/b;->a:[C
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x2
a=0;//         0x3
a=0;//         0x5
a=0;//         0x7
a=0;//         0xb
a=0;//         0xd
a=0;//         0x11
a=0;//         0x13
a=0;//         0x17
a=0;//         0x1d
a=0;//         0x1f
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public static final a(C)I
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/String;->indexOf(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static final a(I)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, p0, :cond_0
a=0;// 
a=0;//     sget-object v2, Lnet/slidingmenu/tools/b/b/d/b;->b:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/b/b/b/d;->a(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     sget-object v3, Lnet/slidingmenu/tools/b/b/d/b;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     rem-int/2addr v2, v3
a=0;// 
a=0;//     sget-object v3, Lnet/slidingmenu/tools/b/b/d/b;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     aget-char v2, v3, v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v0, "abcd"
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static final a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     shl-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x3
a=0;// 
a=0;//     invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v3, v1, :cond_2
a=0;// 
a=0;//     add-int/lit8 v0, v3, 0x3
a=0;// 
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     add-int/lit8 v0, v3, 0x3
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v5, 0x10
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge v5, v0, :cond_1
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sget-object v6, Lnet/slidingmenu/tools/b/b/d/b;->b:[C
a=0;// 
a=0;//     #v6=(Reference,[C);
a=0;//     aget-char v0, v6, v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/d/b;->b:[C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     and-int/lit8 v5, v5, 0x3f
a=0;// 
a=0;//     aget-char v0, v0, v5
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v0, v3, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v5=(Integer);
a=0;//     ushr-int/lit8 v0, v5, 0x6
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static final a([BLjava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 12
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v0, v2, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     array-length v3, p0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p0, v2, v1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/d/g;->a([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/16 v2, 0x12
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);v6=(Conflicted);
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge v2, v0, :cond_2
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v3, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v4, 0x10
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v0, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge v4, v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     sget-object v6, Lnet/slidingmenu/tools/b/b/d/b;->b:[C
a=0;// 
a=0;//     #v6=(Reference,[C);
a=0;//     aget-char v0, v6, v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/d/b;->b:[C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     and-int/lit8 v4, v4, 0x3f
a=0;// 
a=0;//     aget-char v0, v0, v4
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v6=(Conflicted);
a=0;//     ushr-int/lit8 v0, v4, 0x6
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     const/16 v0, 0x1a
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge v1, v0, :cond_4
a=0;// 
a=0;//     shl-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     const/16 v4, 0x37
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-le v2, v4, :cond_3
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     :cond_3
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(PosByte);v4=(Integer);
a=0;//     const/16 v0, 0x43
a=0;// 
a=0;//     if-ge v2, v0, :cond_5
a=0;// 
a=0;//     const/16 v2, 0x43
a=0;// 
a=0;//     :cond_5
a=0;//     and-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     add-int/lit8 v0, v2, -0x1
a=0;// 
a=0;//     :goto_3
a=0;//     move v4, v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v7=(Conflicted);
a=0;//     if-lez v4, :cond_6
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_5
a=0;//     sget-object v7, Lnet/slidingmenu/tools/b/b/d/b;->c:[I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     array-length v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v0, v7, :cond_f
a=0;// 
a=0;//     sget-object v7, Lnet/slidingmenu/tools/b/b/d/b;->c:[I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     aget v7, v7, v0
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     rem-int v7, v4, v7
a=0;// 
a=0;//     if-nez v7, :cond_9
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Integer);v7=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,[B);
a=0;//     array-length v8, v7
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     array-length v9, p0
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(Integer);v1=(Integer);v3=(Integer);v10=(Conflicted);v11=(Conflicted);
a=0;//     if-ge v1, v9, :cond_b
a=0;// 
a=0;//     aget-byte v10, p0, v1
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     aget-byte v3, v7, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     xor-int/2addr v3, v10
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lt v0, v8, :cond_7
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :cond_7
a=0;//     and-int/lit16 v10, v3, 0xf0
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     ushr-int/lit8 v10, v10, 0x4
a=0;// 
a=0;//     sget-object v11, Lnet/slidingmenu/tools/b/b/d/b;->a:[C
a=0;// 
a=0;//     #v11=(Reference,[C);
a=0;//     aget-char v10, v11, v10
a=0;// 
a=0;//     #v10=(Char);
a=0;//     invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     and-int/lit8 v3, v3, 0xf
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sget-object v10, Lnet/slidingmenu/tools/b/b/d/b;->a:[C
a=0;// 
a=0;//     #v10=(Reference,[C);
a=0;//     aget-char v3, v10, v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :cond_8
a=0;//     #v3=(Reference,Ljava/lang/String;);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     add-int/lit8 v0, v2, -0x2
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(One);v7=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Boolean);
a=0;//     add-int/lit8 v0, v4, -0x2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v4, v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_b
a=0;//     #v1=(Integer);v3=(Integer);v7=(Reference,[B);v8=(Integer);v9=(Integer);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/d/b;->b:[C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     rem-int/lit8 v3, v1, 0x3
a=0;// 
a=0;//     aget-char v0, v0, v3
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v3, v2
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_8
a=0;//     #v0=(Integer);v9=(Conflicted);
a=0;//     if-ge v2, v1, :cond_e
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x3
a=0;// 
a=0;//     if-ge v0, v1, :cond_c
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x3
a=0;// 
a=0;//     :goto_9
a=0;//     invoke-virtual {v7, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v8, 0x10
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-static {v0, v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge v8, v0, :cond_d
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_a
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     mul-int/2addr v3, v4
a=0;// 
a=0;//     add-int/2addr v3, p2
a=0;// 
a=0;//     and-int/lit8 v3, v3, 0x3f
a=0;// 
a=0;//     sget-object v9, Lnet/slidingmenu/tools/b/b/d/b;->b:[C
a=0;// 
a=0;//     #v9=(Reference,[C);
a=0;//     add-int/2addr v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x3f
a=0;// 
a=0;//     aget-char v0, v9, v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     mul-int v0, v4, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p2
a=0;// 
a=0;//     and-int/lit8 v3, v0, 0x3f
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/d/b;->b:[C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     add-int/2addr v8, v3
a=0;// 
a=0;//     and-int/lit8 v8, v8, 0x3f
a=0;// 
a=0;//     aget-char v0, v0, v8
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :cond_c
a=0;//     #v9=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     :cond_d
a=0;//     #v0=(PosByte);
a=0;//     ushr-int/lit8 v0, v8, 0x6
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_a
a=0;// 
a=0;//     :cond_e
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
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
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Integer);v1=(One);v3=(Reference,Ljava/lang/String;);v7=(Integer);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_6
a=0;// .end method
a=0;// 
a=0;// .method public static final b(I)C
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/d/b;->b:[C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge p0, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-le p0, v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/d/b;->b:[C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     aget-char v0, v0, p0
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/16 v0, 0x30
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
}}
