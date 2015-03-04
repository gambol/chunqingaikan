package net.slidingmenu.tools.b.b.b; class a { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/b/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final a:[C
a=0;// 
a=0;// .field private static final b:[C
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "0123456789abcdef"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/b/a;->a:[C
a=0;// 
a=0;//     const-string v0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/b/a;->b:[C
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(C)B
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result p0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "0123456789abcdef"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/String;->indexOf(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a([B)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     sget-object v2, Lnet/slidingmenu/tools/b/b/b/a;->a:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     aget-byte v3, p0, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/lit16 v3, v3, 0xf0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     ushr-int/lit8 v3, v3, 0x4
a=0;// 
a=0;//     aget-char v2, v2, v3
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     sget-object v2, Lnet/slidingmenu/tools/b/b/b/a;->a:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     aget-byte v3, p0, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/lit8 v3, v3, 0xf
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-char v2, v2, v3
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
