package com.tencent.weiyun; class FileManager$WeiyunFileType { void a() { int a;
a=0;// .class public final enum Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// .super Ljava/lang/Enum;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/weiyun/FileManager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x4019
a=0;//     name = "WeiyunFileType"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Enum",
a=0;//         "<",
a=0;//         "Lcom/tencent/weiyun/FileManager$WeiyunFileType;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final synthetic $VALUES:[Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;// .field public static final enum ImageFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;// .field public static final enum MusicFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;// .field public static final enum VideoFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mType:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 70
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     const-string v1, "ImageFile"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v2}, Lcom/tencent/weiyun/FileManager$WeiyunFileType;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     sput-object v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->ImageFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     const-string v1, "MusicFile"
a=0;// 
a=0;//     invoke-direct {v0, v1, v3, v3}, Lcom/tencent/weiyun/FileManager$WeiyunFileType;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     sput-object v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->MusicFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     .line 72
a=0;//     new-instance v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     const-string v1, "VideoFile"
a=0;// 
a=0;//     invoke-direct {v0, v1, v4, v4}, Lcom/tencent/weiyun/FileManager$WeiyunFileType;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     sput-object v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->VideoFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     .line 69
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     sget-object v1, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->ImageFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->MusicFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->VideoFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->$VALUES:[Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;II)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 76
a=0;//     #p0=(Reference,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     iput p3, p0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->mType:I
a=0;// 
a=0;//     .line 77
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static valueOf(Ljava/lang/String;)Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     const-class v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static values()[Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     sget-object v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->$VALUES:[Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     invoke-virtual {v0}, [Lcom/tencent/weiyun/FileManager$WeiyunFileType;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public value()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     iget v0, p0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->mType:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
