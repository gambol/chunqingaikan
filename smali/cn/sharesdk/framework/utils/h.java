package cn.sharesdk.framework.utils; class h { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/utils/h;
a=0;// .super Lcn/sharesdk/framework/utils/k;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:[C
a=0;// 
a=0;// .field private static final b:[C
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final c:Z
a=0;// 
a=0;// .field private final d:[Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v2, 0x2b
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput-char v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcn/sharesdk/framework/utils/h;->a:[C
a=0;// 
a=0;//     const-string v0, "0123456789ABCDEF"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/utils/k;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/utils/h;);
a=0;//     const-string v0, ".*[0-9A-Za-z].*"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Alphanumeric characters are always \'safe\' and should not be explicitly specified"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     const-string v0, " "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "plusForSpace cannot be specified when space is a \'safe\' character"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-string v0, "%"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "The \'%\' character cannot be specified as \'safe\'"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iput-boolean p2, p0, Lcn/sharesdk/framework/utils/h;->c:Z
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/utils/h;->a(Ljava/lang/String;)[Z
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Z);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/utils/h;->d:[Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;)[Z
a=0;//     .locals 8
a=0;// 
a=0;//     const/16 v3, 0x7a
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[C);
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Integer);v6=(Conflicted);
a=0;//     if-ge v1, v5, :cond_0
a=0;// 
a=0;//     aget-char v6, v4, v1
a=0;// 
a=0;//     #v6=(Char);
a=0;//     invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     new-array v2, v1, [Z
a=0;// 
a=0;//     #v2=(Reference,[Z);
a=0;//     const/16 v1, 0x30
a=0;// 
a=0;//     :goto_1
a=0;//     const/16 v5, 0x39
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-gt v1, v5, :cond_1
a=0;// 
a=0;//     aput-boolean v7, v2, v1
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     const/16 v1, 0x41
a=0;// 
a=0;//     :goto_2
a=0;//     const/16 v5, 0x5a
a=0;// 
a=0;//     if-gt v1, v5, :cond_2
a=0;// 
a=0;//     aput-boolean v7, v2, v1
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     const/16 v1, 0x61
a=0;// 
a=0;//     :goto_3
a=0;//     if-gt v1, v3, :cond_3
a=0;// 
a=0;//     aput-boolean v7, v2, v1
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_3
a=0;//     array-length v1, v4
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Integer);v3=(Char);
a=0;//     if-ge v0, v1, :cond_4
a=0;// 
a=0;//     aget-char v3, v4, v0
a=0;// 
a=0;//     aput-boolean v7, v2, v3
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_4
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Ljava/lang/CharSequence;II)I
a=0;//     .locals 2
a=0;// 
a=0;//     :goto_0
a=0;//     if-ge p2, p3, :cond_0
a=0;// 
a=0;//     invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/utils/h;->d:[Z
a=0;// 
a=0;//     #v1=(Reference,[Z);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/utils/h;->d:[Z
a=0;// 
a=0;//     #v1=(Reference,[Z);
a=0;//     aget-boolean v0, v1, v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return p2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,[Z);
a=0;//     add-int/lit8 p2, p2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected a(I)[C
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v2, 0x25
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/h;->d:[Z
a=0;// 
a=0;//     #v0=(Reference,[Z);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge p1, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/h;->d:[Z
a=0;// 
a=0;//     #v0=(Reference,[Z);
a=0;//     aget-boolean v0, v0, p1
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,[C);v1=(Char);v2=(Conflicted);v3=(Integer);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Null);v2=(PosByte);v3=(PosByte);v4=(Uninit);
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcn/sharesdk/framework/utils/h;->c:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/utils/h;->a:[C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(PosByte);
a=0;//     const/16 v0, 0x7f
a=0;// 
a=0;//     if-gt p1, v0, :cond_2
a=0;// 
a=0;//     new-array v0, v3, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     aput-char v2, v0, v1
a=0;// 
a=0;//     sget-object v1, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     and-int/lit8 v2, p1, 0xf
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-char v1, v1, v2
a=0;// 
a=0;//     #v1=(Char);
a=0;//     aput-char v1, v0, v6
a=0;// 
a=0;//     sget-object v1, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     ushr-int/lit8 v2, p1, 0x4
a=0;// 
a=0;//     aget-char v1, v1, v2
a=0;// 
a=0;//     #v1=(Char);
a=0;//     aput-char v1, v0, v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(PosByte);v1=(Null);v2=(PosByte);
a=0;//     const/16 v0, 0x7ff
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-gt p1, v0, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     aput-char v2, v0, v1
a=0;// 
a=0;//     aput-char v2, v0, v3
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     sget-object v2, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     and-int/lit8 v3, p1, 0xf
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-char v2, v2, v3
a=0;// 
a=0;//     #v2=(Char);
a=0;//     aput-char v2, v0, v1
a=0;// 
a=0;//     ushr-int/lit8 v1, p1, 0x4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     sget-object v3, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     and-int/lit8 v4, v1, 0x3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     or-int/lit8 v4, v4, 0x8
a=0;// 
a=0;//     aget-char v3, v3, v4
a=0;// 
a=0;//     #v3=(Char);
a=0;//     aput-char v3, v0, v2
a=0;// 
a=0;//     ushr-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     sget-object v2, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     and-int/lit8 v3, v1, 0xf
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-char v2, v2, v3
a=0;// 
a=0;//     #v2=(Char);
a=0;//     aput-char v2, v0, v6
a=0;// 
a=0;//     ushr-int/lit8 v1, v1, 0x4
a=0;// 
a=0;//     sget-object v2, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     or-int/lit8 v1, v1, 0xc
a=0;// 
a=0;//     aget-char v1, v2, v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     aput-char v1, v0, v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(PosShort);v1=(Null);v2=(PosByte);v3=(PosByte);v4=(Uninit);
a=0;//     const v0, 0xffff
a=0;// 
a=0;//     #v0=(Char);
a=0;//     if-gt p1, v0, :cond_4
a=0;// 
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     aput-char v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0x45
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aput-char v1, v0, v5
a=0;// 
a=0;//     aput-char v2, v0, v3
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     aput-char v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     sget-object v2, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     and-int/lit8 v3, p1, 0xf
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-char v2, v2, v3
a=0;// 
a=0;//     #v2=(Char);
a=0;//     aput-char v2, v0, v1
a=0;// 
a=0;//     ushr-int/lit8 v1, p1, 0x4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     sget-object v3, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     and-int/lit8 v4, v1, 0x3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     or-int/lit8 v4, v4, 0x8
a=0;// 
a=0;//     aget-char v3, v3, v4
a=0;// 
a=0;//     #v3=(Char);
a=0;//     aput-char v3, v0, v2
a=0;// 
a=0;//     ushr-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     sget-object v3, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     and-int/lit8 v4, v1, 0xf
a=0;// 
a=0;//     aget-char v3, v3, v4
a=0;// 
a=0;//     #v3=(Char);
a=0;//     aput-char v3, v0, v2
a=0;// 
a=0;//     ushr-int/lit8 v1, v1, 0x4
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     sget-object v3, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     and-int/lit8 v4, v1, 0x3
a=0;// 
a=0;//     or-int/lit8 v4, v4, 0x8
a=0;// 
a=0;//     aget-char v3, v3, v4
a=0;// 
a=0;//     #v3=(Char);
a=0;//     aput-char v3, v0, v2
a=0;// 
a=0;//     ushr-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     sget-object v2, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     aget-char v1, v2, v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     aput-char v1, v0, v6
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Char);v1=(Null);v2=(PosByte);v3=(PosByte);v4=(Uninit);
a=0;//     const v0, 0x10ffff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt p1, v0, :cond_5
a=0;// 
a=0;//     const/16 v0, 0xc
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     aput-char v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0x46
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aput-char v1, v0, v5
a=0;// 
a=0;//     aput-char v2, v0, v3
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     aput-char v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     aput-char v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     sget-object v2, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     and-int/lit8 v3, p1, 0xf
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-char v2, v2, v3
a=0;// 
a=0;//     #v2=(Char);
a=0;//     aput-char v2, v0, v1
a=0;// 
a=0;//     ushr-int/lit8 v1, p1, 0x4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     sget-object v3, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     and-int/lit8 v4, v1, 0x3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     or-int/lit8 v4, v4, 0x8
a=0;// 
a=0;//     aget-char v3, v3, v4
a=0;// 
a=0;//     #v3=(Char);
a=0;//     aput-char v3, v0, v2
a=0;// 
a=0;//     ushr-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     sget-object v3, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     and-int/lit8 v4, v1, 0xf
a=0;// 
a=0;//     aget-char v3, v3, v4
a=0;// 
a=0;//     #v3=(Char);
a=0;//     aput-char v3, v0, v2
a=0;// 
a=0;//     ushr-int/lit8 v1, v1, 0x4
a=0;// 
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     sget-object v3, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     and-int/lit8 v4, v1, 0x3
a=0;// 
a=0;//     or-int/lit8 v4, v4, 0x8
a=0;// 
a=0;//     aget-char v3, v3, v4
a=0;// 
a=0;//     #v3=(Char);
a=0;//     aput-char v3, v0, v2
a=0;// 
a=0;//     ushr-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     sget-object v3, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     and-int/lit8 v4, v1, 0xf
a=0;// 
a=0;//     aget-char v3, v3, v4
a=0;// 
a=0;//     #v3=(Char);
a=0;//     aput-char v3, v0, v2
a=0;// 
a=0;//     ushr-int/lit8 v1, v1, 0x4
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     sget-object v3, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     and-int/lit8 v4, v1, 0x3
a=0;// 
a=0;//     or-int/lit8 v4, v4, 0x8
a=0;// 
a=0;//     aget-char v3, v3, v4
a=0;// 
a=0;//     #v3=(Char);
a=0;//     aput-char v3, v0, v2
a=0;// 
a=0;//     ushr-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     sget-object v2, Lcn/sharesdk/framework/utils/h;->b:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     and-int/lit8 v1, v1, 0x7
a=0;// 
a=0;//     aget-char v1, v2, v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     aput-char v1, v0, v6
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Null);v2=(PosByte);v3=(PosByte);v4=(Uninit);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Invalid unicode character value "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public escape(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/utils/h;->d:[Z
a=0;// 
a=0;//     #v3=(Reference,[Z);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/utils/h;->d:[Z
a=0;// 
a=0;//     #v3=(Reference,[Z);
a=0;//     aget-boolean v2, v3, v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Char);v3=(Conflicted);
a=0;//     invoke-virtual {p0, p1, v0}, Lcn/sharesdk/framework/utils/h;->a(Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Boolean);v3=(Reference,[Z);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
